package com.pwc.offering.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/**").permitAll();
        http.antMatcher("/**").authorizeRequests().antMatchers("/swagger-ui/index.html").permitAll();

//        http.antMatcher("/**").authorizeRequests().anyRequest().authenticated().and().oauth2Login();
        return http.build();
    }

}
