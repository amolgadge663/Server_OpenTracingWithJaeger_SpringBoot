package com.amolsoftwares.www.ServerJaeger.config;

import io.jaegertracing.internal.JaegerTracer;
import io.jaegertracing.internal.samplers.ConstSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class JaegerConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    
    @Bean
    public JaegerTracer jaegerTracer(){

        return new io.jaegertracing.Configuration("server-jaeger")
                .withSampler(new io.jaegertracing.Configuration.SamplerConfiguration()
                        .withType(ConstSampler.TYPE)
                        .withParam(1))
                .withReporter(new io.jaegertracing.Configuration.ReporterConfiguration()
                        .withLogSpans(true))
                .getTracer();
    }
}