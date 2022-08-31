package com.sadegh.spring.context;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sadegh.spring.context")
public class ContextConfig {

    @Bean
    public Logger logger(){
        Logger logger=Logger.getLogger(ContextConfig.class);
        return logger;
    }


}
