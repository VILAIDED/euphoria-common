package com.euphoria.common.domain.model;

import lombok.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class UserPrincipal {
    private UUID id;
    private String username;
    private String roles;

}
