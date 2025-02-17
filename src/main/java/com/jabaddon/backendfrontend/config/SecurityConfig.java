package com.jabaddon.backendfrontend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers(
                                "/example/**"
                        )
                )
                .authorizeHttpRequests(authorizeCustomize -> {
                    authorizeCustomize
                            .requestMatchers(
                                    "/assets/**",
                                      "*.svg",
                                    "*.ico"
                            ).permitAll()
                            .anyRequest().authenticated();
                })
                .formLogin(formLoginCustomize -> {
                    formLoginCustomize
                            .loginPage("/auth/login")
                            .permitAll();
                })
                .logout(logoutCustomize -> {
                    logoutCustomize
                            .logoutUrl("/auth/logout")
                            .logoutSuccessUrl("/auth/login")
                            .permitAll();
                });
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }
}
