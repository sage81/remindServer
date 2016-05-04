package com.yava.remind.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * Created by Yaroslav on 4/28/2016.
 */
@Configuration
@EnableJpaRepositories("com.yava.remind.server.repository")
@EnableTransactionManagement
@ComponentScan("com.yava.remind.server")
public class DatabaseConfig {

    @Resource
    private Environment env;

}
