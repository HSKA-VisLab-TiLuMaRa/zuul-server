package de.hska.iwi.vslab.zuulserver;

import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.util.matcher.RequestHeaderRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {


	@Override
    public void configure(HttpSecurity http) throws Exception {

		System.out.println("zuul http config, resourceserver ");

		http
		.cors().and()
		.csrf().and()
		.requestMatcher(new RequestHeaderRequestMatcher("Authorization"))
		.authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		.antMatchers("/**").authenticated();
	}

	//The CORS filter bean - Configures allowed CORS any (source) to any
    //(api route and method) endpoint
    // @Bean
    // CorsConfigurationSource corsConfigurationSource() {
    //     final UrlBasedCorsConfigurationSource source = new     UrlBasedCorsConfigurationSource();
    //     final CorsConfiguration config = new CorsConfiguration();
    //     config.setAllowCredentials(true);
    //     config.addAllowedOrigin("*");
    //     config.addAllowedHeader("*");
    //     config.addAllowedMethod("OPTIONS");
    //     config.addAllowedMethod("HEAD");
    //     config.addAllowedMethod("GET");
    //     config.addAllowedMethod("PUT");
    //     config.addAllowedMethod("POST");
    //     config.addAllowedMethod("DELETE");
    //     config.addAllowedMethod("PATCH");
    //     source.registerCorsConfiguration("/**", config);
    //     return source;
    // }


}
