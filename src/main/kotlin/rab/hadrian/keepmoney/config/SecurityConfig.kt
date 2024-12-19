package rab.hadrian.keepmoney.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { csrf -> csrf.disable() } // Desabilita CSRF (recomendado apenas para APIs sem sessões)
            .authorizeHttpRequests { auth ->
                auth
                    .requestMatchers("/login", "/register").permitAll() // Permite sem autenticação para rotas de login e registro
                    .anyRequest().authenticated() // Exige autenticação para todas as outras rotas
            }
            .formLogin { form ->
                form.loginPage("/login")  // Se você tem uma página personalizada para login
                form.permitAll()  // Permite acesso à página de login sem autenticação
            }

        return http.build()
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }
}