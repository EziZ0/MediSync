package com.elzin.patient_service_microservices.Configuration;

import com.elzin.patient_service_microservices.Client.AmbulanceClient;
import com.elzin.patient_service_microservices.Client.HospitalClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class RestClientConfig {

    @Value("${ambulance.url}")
    private String inventoryServiceUrl;

    @Value("${hospital.url}")
    private String hospitalServiceUrl;

    @Bean
    public AmbulanceClient ambulanceClient(){
        RestClient restClient = RestClient.builder()
                .baseUrl(inventoryServiceUrl)
                .build();
        var restClientAdapter = RestClientAdapter.create(restClient);
        var httpServiceProxyFactory = HttpServiceProxyFactory.builderFor(restClientAdapter).build();
        return httpServiceProxyFactory.createClient(AmbulanceClient.class);
    }

    @Bean
    public HospitalClient hospitalClient(){
        RestClient restClient = RestClient.builder()
                .baseUrl(hospitalServiceUrl)
                .build();
        var restClientAdapter = RestClientAdapter.create(restClient);
        var httpServiceProxyFactory = HttpServiceProxyFactory.builderFor(restClientAdapter).build();
        return httpServiceProxyFactory.createClient(HospitalClient.class);
    }

}