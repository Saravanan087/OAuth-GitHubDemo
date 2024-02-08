package com.Oauth.SampleOauth.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MyConfiguration {
	
	@Bean
	SecurityFilterChain httpsecuritychain(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests(auth -> {
					auth.antMatchers("/Home").permitAll();
				auth.anyRequest().authenticated();
				}) 
				.oauth2Login(Customizer.withDefaults())
		.formLogin(Customizer.withDefaults())
		.build();
	}
}
