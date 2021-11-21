package io.github.openfeign;

import feign.Feign;
import feign.Logger;
import feign.Retryer;
import io.github.openfeign.client.FeignClient;

/**
 * @author Jie Zhao
 * @date 2021/11/21 13:51
 */
public class FeignMain {

    public static void main(String[] args) {
        FeignClient feignClient = Feign.builder()
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.FULL)
                .retryer(Retryer.NEVER_RETRY) // 关闭重试
                .decode404()
                .target(FeignClient.class, "http://localhost:8080");
        System.out.println(feignClient.demo("world"));
    }
}
