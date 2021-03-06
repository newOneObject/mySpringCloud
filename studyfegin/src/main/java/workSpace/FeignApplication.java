package workSpace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Administrator on 2018/3/23.
 * feign消费者
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
  public static  void main(String[] args){
      SpringApplication.run(FeignApplication.class,args);}
}
