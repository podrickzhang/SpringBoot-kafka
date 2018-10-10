package io.ymq.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 描述:消息消费者
 **/
@Component
public class MsgConsumer {

    @KafkaListener(topics = {"topic-1","topic-2"})
    public void processMessage(String content) {

        System.out.println("消息被消费"+content);
    }

    @KafkaListener(topics = "topic-2")
    public void processMessage1(String content) {

        System.out.println("消息被消费"+content);
    }
}