package com.raven.springbootsecuritybasic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
		/* httpSecurity.authorizeRequests().anyRequest().authenticated(); */
		httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
		httpSecurity.formLogin();
		httpSecurity.httpBasic();

		return httpSecurity.build();
	}
}
