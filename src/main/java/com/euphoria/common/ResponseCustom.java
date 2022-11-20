package com.euphoria.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
@Data
public class ResponseCustom {


  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String error;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Object data;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Object meta;

  public static ResponseCustom successResponse(Object data) {
    return ResponseCustom.builder().data(data).build();
  }

  public static ResponseCustom successResponseWithMeta(Object data, Object meta) {
    return ResponseCustom.builder().data(data).meta(meta).build();
  }

  public static ResponseCustom errorResponse(String error) {
    return ResponseCustom.builder().error(error).build();
  }
}
