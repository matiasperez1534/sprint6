package mod6.grupal5.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(PasswordEncoder encoder) {
        UserDetails cliente = User.withUsername("cliente")
                .password(encoder.encode("root"))
                .roles("CLIENTE")
                .build();
        UserDetails profesional = User.withUsername("profesional")
                .password(encoder.encode("root"))
                .roles("PROFESIONAL")
                .build();
        UserDetails administrativo = User.withUsername("administrativo")
                .password(encoder.encode("root"))
                .roles("ADMINISTRATIVO")
                .build();

        return new InMemoryUserDetailsManager(cliente, profesional, administrativo);
    }




    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers("/contacto").hasRole("CLIENTE")
                .requestMatchers("/").hasRole("PROFESIONAL")
                .requestMatchers("/").hasRole("ADMINISTRATIVO")
                .and()
                .httpBasic(Customizer.withDefaults())
                .formLogin()
                .loginPage("/")
                .defaultSuccessUrl("/inicio", true)
                .permitAll()
                .and()
                .logout().permitAll();


        return http.build();
    }

    @Bean
    public PasswordEncoder encoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}
