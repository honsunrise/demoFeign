package demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by iCoderc on 2015/8/25.
 */
@FeignClient("server1")
public interface Server1Client {
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello();
}
