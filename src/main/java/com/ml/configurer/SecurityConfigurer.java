package com.ml.configurer;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {

    //@formatter:off
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/").permitAll()
                    .antMatchers("/**").permitAll()
                .and()
                .authorizeRequests()
                    .antMatchers("/console/**").permitAll()
                .and()
                .csrf()
                    .disable()
                .headers()
                    .frameOptions().disable();
    }
    //@formatter:on
}
