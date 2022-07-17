package com.Scrum_Sprint_Planning.Mandywu.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        http.authorizeRequests().antMatchers("/publicApis/*").permitAll()

        http.
                httpBasic().disable()// disable spring boot's own oauth Server
                .authorizeRequests()
                .antMatchers("/**").permitAll()
//                .antMatchers("/public/product/{product_id}").permitAll()
                .anyRequest().authenticated()  // can set which request no need to be authenticated().

                .and()
                .sessionManagement()// session means the period of relationship between firebase and springboot
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)

                .and()
                .cors()

                .and()
                .csrf().disable();


        ;
    }
}
