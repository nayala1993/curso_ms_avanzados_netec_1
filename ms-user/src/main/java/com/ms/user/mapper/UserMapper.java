package com.ms.user.mapper;

import com.ms.user.dto.UserDTO;
import com.ms.user.model.UserEntity;

public class UserMapper {

    //metodo para mapear lo del dto hacia el entity
    public static UserEntity getUserDtoToUserEntity(UserDTO userDTO){
        //esto ahorra instanciar el UserEntity y hacer los set(userdto.get)
        return UserEntity
                .builder()
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .information(userDTO.getInformation())
                .document(userDTO.getDocument())
                .build();
    }
    //metodo para mapear lo que viene del Entity hacia el dto
    public static UserEntity getUserEntityMapperUserDto (UserEntity userEntity, UserDTO userDTO){
        userEntity.setName(userDTO.getName());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setInformation(userDTO.getInformation());
        userEntity.setDocument(userDTO.getDocument());

        return userEntity;
    }
}
