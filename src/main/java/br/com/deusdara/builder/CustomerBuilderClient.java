package br.com.deusdara.builder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.deusdara.client.CustomerClient;
import feign.Feign;
import feign.Logger.Level;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

@Configuration
public class CustomerBuilderClient {
	@Bean
	public CustomerClient getCustomerClient() {
		return Feign.builder()
			.client(new OkHttpClient())
			.encoder(new GsonEncoder())
			.decoder(new GsonDecoder())
			.logger(new Slf4jLogger(CustomerClient.class))
			.logLevel(Level.FULL)
			.target(CustomerClient.class, "http://localhost:9000/customer");
	}
}