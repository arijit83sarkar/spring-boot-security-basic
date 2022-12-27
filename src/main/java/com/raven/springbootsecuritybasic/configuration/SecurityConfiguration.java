package com.raven.springbootsecuritybasic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(
            HttpSecurity httpSecurity) throws Exception {
        /*httpSecurity.authorizeRequests().anyRequest().authenticated();*/

        /* DEFAULT SECURITY */
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
        httpSecurity.formLogin();
        httpSecurity.httpBasic();

        return httpSecurity.build();

        /* CUSTOM SECURITY */
        /*httpSecurity.authorizeHttpRequests()
                .antMatchers("/myCourses").authenticated()
                .antMatchers("/welcome").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return httpSecurity.build();*/

        /* CUSTOM SECURITY - ACCESS ENDPOINTS WITHOUT SECURITY */
        /*httpSecurity.authorizeHttpRequests()
                .anyRequest().permitAll()
                .and().formLogin()
                .and().httpBasic();
        return httpSecurity.build();*/

        /* CUSTOM SECURITY - MAKE ENDPOINTS INACCESSIBLE */
        /*httpSecurity.authorizeHttpRequests()
                .anyRequest().denyAll();
        return httpSecurity.build();*/
    }
}
