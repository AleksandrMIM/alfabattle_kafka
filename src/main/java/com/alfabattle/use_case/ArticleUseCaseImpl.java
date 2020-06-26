package com.alfabattle.use_case;

import com.alfabattle.api.TestRequest;
import com.alfabattle.api.TestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 12:19
 */
@Service
@RequiredArgsConstructor
public class ArticleUseCaseImpl implements ArticleUseCase {



  @Override
  public @NotNull
  TestResponse saveArticle(@NotNull TestRequest testRequest) {
    return new TestResponse();
  }
}
