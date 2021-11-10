package com.generation.SpringSecurityJWT.controller;

import com.generation.SpringSecurityJWT.model.Post;
import com.generation.SpringSecurityJWT.service.PostService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PostControllerTest {
    @Test
    @DisplayName("Probando mockito")
    void testMockito(){
        //mock creation
        List mockedList = mock(List.class);

        //using mock object
        mockedList.add("one");
        mockedList.clear();

        //verification
        verify(mockedList).add("one");
        verify(mockedList).clear();

    }

    @Test
    @DisplayName("Probando mockito v2")
    void testMockito2(){

        // Crea un objeto simulado, el parámetro puede ser una clase o una interfaz
        List<String> list = mock(List.class);

        // Establecer el valor de retorno esperado del método
        when(list.get(0)).thenReturn("helloworld");

        String result = list.get(0);

        // Verifica la llamada al método (si se llama a get (0))
        verify(list).get(0);

        // prueba junit
        assertEquals("helloworld", result);
    }

    @Test
    @DisplayName("Pruebas en el post")
    void postSaveTet(){
        //Post service per con mockito para modelarlo
        PostService postService = mock(PostService.class);

        //Creacion del post controller
        PostController postController = new PostController(postService);

        //Creación del post con elementos
        Post post = new Post();
        post.setTitle("Pruebas en JUnit con mockito");
        post.setContent("Contenido del post");

        //Cuando se salve un post, usa any de tipo post y retorna un post
        when(postService.save(any(Post.class))).thenReturn(post);
        //Obtener el resultado del post
        Post result =postController.save(post);
        verify(postService, times(1)).save(any(Post.class));

        //Igualación de los resultado sea igual
        assertEquals(post.getTitle(),  result.getTitle());
    }

}