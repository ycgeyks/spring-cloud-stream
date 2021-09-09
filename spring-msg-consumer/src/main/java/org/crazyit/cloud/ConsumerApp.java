package org.crazyit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(ReceiveService.class)
public class ConsumerApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsumerApp.class).web(true).run(args);
	}

	@StreamListener("myInput")
	public void onReceive(byte[] msg) {
		System.out.println("消息者1，接收到的消息：" + new String(msg));
	}
}
