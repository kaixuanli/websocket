package my.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author likaixuan email:likaixuan(a)innodev.com.cn
 * @Date: 2019/6/5 18:13
 * @Version 1.0
 */
@Configuration
public class WebSocketConfig {
    //注入ServerEndpointExporter，这个bean会自动注册使用了@ServerEndpoint注解声明的Websocket endpoint
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
