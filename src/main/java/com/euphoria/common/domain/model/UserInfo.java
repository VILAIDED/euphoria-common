package com.euphoria.common.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class UserInfo {
    private UUID idUser;
    private String name;
    private String phone;
    private String address;
    private String avatar;
}
