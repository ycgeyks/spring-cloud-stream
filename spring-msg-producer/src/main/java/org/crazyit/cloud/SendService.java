package org.crazyit.cloud;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface SendService {

	@Output("myInput")//myInput是交换器Exchange名称
	SubscribableChannel sendOrder();
}
