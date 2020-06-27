package com.alfabattle.client;

import com.alfabattle.api.TestRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * User: @AleksandrMIM
 * Date: 27.06.2020
 * Time: 12:23
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

  private final ObjectMapper objectMapper;

  @SneakyThrows
  @KafkaListener(topics = "${kafka.topic}", groupId = "${kafka.consumer.group-id}")
  public void consume(TestRequest request) {
    var message = objectMapper.writeValueAsString(request);
    logger.info(String.format("#### -> Consumed message -> %s", message));
  }
}
