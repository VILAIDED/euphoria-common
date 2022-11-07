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

  private String status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Object error;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Object data;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Object meta;

  public static ResponseCustom success(Object data) {
    return ResponseCustom.builder().status(StatusMessage.SUCCESS).data(data).build();
  }

  public static ResponseCustom successWithMeta(Object data, Object meta) {
    return ResponseCustom.builder().status(StatusMessage.SUCCESS).data(data).meta(meta).build();
  }

  public static ResponseCustom error(Object error) {
    return ResponseCustom.builder().status(StatusMessage.ERROR).error(error).build();
  }
}
