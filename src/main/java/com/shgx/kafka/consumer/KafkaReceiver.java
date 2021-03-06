package com.shgx.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import java.util.Optional;

/**
 * Created by guangxush on 2018/8/27
 */
@Component
@Slf4j
public class KafkaReceiver {

    private static final String TOPIC = "shgx";
    /**
     * receive data from kafka topic
     * @param record
     */
    @KafkaListener(topics = {TOPIC})
    public void listen(ConsumerRecord<?, ?> record) {

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            log.info("----------------- record =" + record);
            log.info("----------------- message =" + message);
        }
    }
}
