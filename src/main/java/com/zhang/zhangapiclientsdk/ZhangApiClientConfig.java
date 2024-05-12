package com.zhang.zhangapiclientsdk;

import com.zhang.zhangapiclientsdk.client.ZhangApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties("zhangapi.client")
@Data
@ComponentScan
public class ZhangApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public ZhangApiClient zhangApiClient() {
        return new ZhangApiClient(accessKey, secretKey);
    }

}
