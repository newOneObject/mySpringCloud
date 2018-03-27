package workspace.config;

import feign.Contract;
import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/3/27.
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }
}
