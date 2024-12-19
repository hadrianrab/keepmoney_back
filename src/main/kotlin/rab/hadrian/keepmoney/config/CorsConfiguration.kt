package rab.hadrian.keepmoney.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration as WebCorsConfiguration // Alias para evitar conflito
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

@Configuration
class AppCorsConfiguration {

    @Bean
    fun corsConfigurationSource(): UrlBasedCorsConfigurationSource {
        val source = UrlBasedCorsConfigurationSource()
        val config = WebCorsConfiguration()  // Usando o alias para evitar conflito
        config.addAllowedOrigin("*")
        config.addAllowedHeader("*")
        config.addAllowedMethod("*")
        source.registerCorsConfiguration("/**", config)

        return source
    }
}