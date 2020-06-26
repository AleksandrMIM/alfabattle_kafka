package com.alfabattle.api;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * User: @AleksandrMIM
 * Date: 25.06.2020
 * Time: 23:32
 */
@Getter
@Setter
public class TestRequest {

  @NotBlank
  private String title;
  private List<String> authorName;
  private List<String> tag;
}
