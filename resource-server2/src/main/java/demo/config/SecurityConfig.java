package demo.config;

import org.springframework.boot.actuate.autoconfigure.ManagementServerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by iCoderc on 2015/8/20.
 */

//@Configuration
//@EnableWebSecurity
//@Order(ManagementServerProperties.ACCESS_OVERRIDE_ORDER)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/resources/**", "/static*/**", "/images*/**");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().anyRequest().anonymous();
//    }
//}

/**
 * if no upper security config it will throw :
 * java.lang.NullPointerException: null
 *    at feign.ribbon.LoadBalancingTarget.apply(LoadBalancingTarget.java:95) ~[feign-ribbon-8.7.1.jar:8.7.1]
 *    at feign.SynchronousMethodHandler.targetRequest(SynchronousMethodHandler.java:141) ~[feign-core-8.7.1.jar:8.7.1]
 *    at feign.SynchronousMethodHandler.executeAndDecode(SynchronousMethodHandler.java:83) ~[feign-core-8.7.1.jar:8.7.1]
 *    at feign.SynchronousMethodHandler.invoke(SynchronousMethodHandler.java:71) ~[feign-core-8.7.1.jar:8.7.1]
 *    at feign.ReflectiveFeign$FeignInvocationHandler.invoke(ReflectiveFeign.java:94) ~[feign-core-8.7.1.jar:8.7.1]
 *    at com.sun.proxy.$Proxy85.sayHello(Unknown Source) ~[na:na]
 */

public class SecurityConfig{
}

