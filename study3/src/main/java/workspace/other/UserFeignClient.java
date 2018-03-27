package workspace.other;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import workspace.config.FeignConfiguration;
import workspace.model.User;

/**
 * Created by Administrator on 2018/3/27.
 */
@FeignClient(name = "BIGGOD",configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET /helloSpringCloud/{id}")
    public User findById(@Param("id") Long id);
}
