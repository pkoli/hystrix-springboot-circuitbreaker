package com.github.pkoli.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppService implements AppServiceI
{

    @HystrixCommand(fallbackMethod = "getFallbackResource")
    public String getResource() {
        return new RestTemplate().getForObject("https://jsonplaceholder.typicode.com/posts/1", String.class);
    }

    public String getFallbackResource(){
        return "Fallback";
    }
}
