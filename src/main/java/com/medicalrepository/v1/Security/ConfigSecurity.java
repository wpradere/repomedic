package com.medicalrepository.v1.Security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class ConfigSecurity {


    @Qualifier("userDetailsServiceImpl")
    @Autowired
    private UserDetailsService userDetailsService;


    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userDetailsService).passwordEncoder(noPasswordEncoder());
        // auth.inMemoryAuthentication()
        auth.getDefaultUserDetailsService();
            /*    .withUser("Admin")
                .password("{noop}123") //using method passwordEncoder
                .roles("ADMIN")
                .and()
                .withUser("user")
                .password("{noop}158")
                .roles("USER");*/

    }

    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable() //Cross-Site Request Forgery (falsificación de petición en sitios cruzados)
                .authorizeRequests()
                .antMatchers("/moongose/Booking").hasAnyRole( "USER","ADMIN")
                .antMatchers("/moongose/Booking/**").hasRole("ADMIN")
                .antMatchers("/moongose/BookingPost/**").hasRole("ADMIN")
                .anyRequest().authenticated() //For any other request, you do not need a specific role but still need to be authenticated.
                .and()
                .httpBasic() //authentication method
                .and()
                .formLogin() //authentication method
                .and()
                .logout(); //http://localhost:8080/login?logout
    }

    @Bean
    public PasswordEncoder noPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
