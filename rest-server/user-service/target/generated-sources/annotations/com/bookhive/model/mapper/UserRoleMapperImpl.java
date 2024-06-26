package com.bookhive.model.mapper;

import com.bookhive.model.dto.UserRoleDto;
import com.bookhive.model.entities.UserRoleEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-26T10:49:32+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class UserRoleMapperImpl implements UserRoleMapper {

    @Override
    public UserRoleDto userRoleEntityToUserRoLeDto(UserRoleEntity userRoleEntity) {
        if ( userRoleEntity == null ) {
            return null;
        }

        UserRoleDto userRoleDto = new UserRoleDto();

        if ( userRoleEntity.getRole() != null ) {
            userRoleDto.setRole( userRoleEntity.getRole().name() );
        }

        return userRoleDto;
    }
}
