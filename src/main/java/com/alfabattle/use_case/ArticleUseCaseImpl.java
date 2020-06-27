package com.alfabattle.use_case;

import com.alfabattle.api.TestRequest;
import com.alfabattle.api.TestResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 12:19
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class ArticleUseCaseImpl implements ArticleUseCase {

  private final KafkaTemplate<String, TestRequest> kafkaTemplate;
  private final ObjectMapper objectMapper;

  @Value("${kafka.topic}")
  private String topic;

  @SneakyThrows
  @Override
  public @NotNull
  TestResponse saveArticle(@NotNull TestRequest testRequest) {
    this.kafkaTemplate.send(topic, testRequest);
    String message = objectMapper.writeValueAsString(testRequest);
    logger.info(String.format("#### -> Producing message -> %s", message));
    return new TestResponse(message);
  }
}
