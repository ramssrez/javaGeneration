package com.generation.SpringSecurityJWT.controller;

import com.generation.SpringSecurityJWT.model.Post;
import com.generation.SpringSecurityJWT.model.User;
import com.generation.SpringSecurityJWT.service.PostService;
import com.generation.SpringSecurityJWT.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class UserControllerTest {
    @Test
    @DisplayName("Pruebas UserController save")
    void saveTest(){
        //Creación del user service
        UserService userService = mock(UserService.class);

        //Creación de la contraseña
        BCryptPasswordEncoder bCryptPasswordEncoder = mock(BCryptPasswordEncoder.class);

        //Creación del user controles, es necesario del servicio y la contraseña criptada
        UserController userController = new UserController(userService, bCryptPasswordEncoder);

        //Creación del usar
        User user = new User();
        user.setName("Raul Ramírez");
        user.setPassword("1234567");

        when(userService.save(any(User.class))).thenReturn(user);

        User result = userController.saveUser(user);
        verify(userService, times(1)).save(any(User.class));
        verify(bCryptPasswordEncoder, atLeastOnce()).encode("1234567");

        //Igualación de los resultado sea igual con los que se obtiene
        assertEquals(user.getName(),  result.getName());

    }

}