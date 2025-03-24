package com.tp.ThymeCare.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager(
                User.withUsername("mreckah").password(passwordEncoder.encode("pass")).roles("USER").build(),
                User.withUsername("oussama").password(passwordEncoder.encode("pass")).roles("ADMIN","USER").build()
        );
    }
    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.formLogin();
        http.authorizeHttpRequests().requestMatchers("/user/**").hasRole("USER");
        http.authorizeHttpRequests().requestMatchers("/admin/**").hasRole("ADMIN");
        http.authorizeHttpRequests().anyRequest().authenticated();

        return http.build();
    }
}
