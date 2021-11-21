package io.github.openfeign.client;

import feign.Param;
import feign.RequestLine;

/**
 * @author Jie Zhao
 * @date 2021/11/21 13:50
 */
public interface FeignClient {

    @RequestLine("GET /feign/demo?name={name}")
    String demo(@Param("name") String name);
}
