package com.alfabattle.use_case;

import com.alfabattle.api.TestRequest;
import com.alfabattle.api.TestResponse;

import javax.validation.constraints.NotNull;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 12:18
 */
public interface ArticleUseCase {

  @NotNull
  TestResponse saveArticle(@NotNull TestRequest testRequest);
}
