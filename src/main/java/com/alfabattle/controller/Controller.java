package com.alfabattle.controller;

import com.alfabattle.api.TestRequest;
import com.alfabattle.api.TestResponse;
import com.alfabattle.use_case.ArticleUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class Controller {

  private final ArticleUseCase articleUseCase;

  @PostMapping("/article")
  public TestResponse helloPost(@Valid @RequestBody TestRequest testRequest) {
    return articleUseCase.saveArticle(testRequest);
  }
}
