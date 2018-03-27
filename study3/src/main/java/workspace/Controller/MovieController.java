package workspace.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import workspace.model.User;
import workspace.other.UserFeignClient;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 * 服务消费者
 */
@RestController
public class MovieController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);


    @Autowired
    private UserFeignClient userFeignClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("user/{id}")
    @ResponseBody
    public User findById(@PathVariable Long id){
        return this.userFeignClient.findById(id);
    }

    @GetMapping("/user-instance")
    @ResponseBody
    public List<ServiceInstance> showInfo(){
        List<ServiceInstance> bigGod = this.discoveryClient.getInstances("BIGGOD");
        return bigGod;
    }


    @GetMapping("/log-instance")
    @ResponseBody
    public void logUserInstance(){
        ServiceInstance biggod = this.loadBalancerClient.choose("BIGGOD");
        MovieController.LOGGER.info("{}:{}:{}",biggod.getServiceId(),biggod.getHost(),biggod.getPort());
    }

}
