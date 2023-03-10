package com.example.bookstoreproject.persistence.user;

import com.example.bookstoreproject.domain.user.User;
import lombok.experimental.UtilityClass;

import java.util.List;

import static org.apache.commons.collections4.ListUtils.emptyIfNull;

@UtilityClass

public class UserEntityMapper {

    public static User toUser(final UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .avatar(userEntity.getAvatar())
                .roleId(userEntity.getRoleId())
                .build();
    }

    public static List<User> toUsers(final List<UserEntity> userEntities) {
        return emptyIfNull(userEntities)
                .stream()
                .map(UserEntityMapper::toUser)
                .toList();
    }

    public static UserEntity toUserEntity(final User user) {
        return UserEntity.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .avatar(user.getAvatar())
                .roleId(user.getRoleId())
                .build();
    }
}
