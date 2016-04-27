package com.yava.remind.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Yaroslav on 4/22/2016.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.yava.remind.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}
