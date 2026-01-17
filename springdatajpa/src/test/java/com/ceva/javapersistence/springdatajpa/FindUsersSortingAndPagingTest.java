package com.ceva.javapersistence.springdatajpa;

import com.ceva.javapersistence.springdatajpa.model.User;
import com.ceva.javapersistence.springdatajpa.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindUsersSortingAndPagingTest extends SpringdatajpaApplicationTests{

    @Test
    public void  testOrder(){
        // obtener el primer usuario en orden ascendente y descendente.
        User user1 = userRepository.findFirstByOrderByUsernameAsc();
        User user2 = userRepository.findTopByOrderByRegistrationDateDesc();

        /**
         * Encontrar todos los Usuarios, dividirlos en paginas
         * retornar la pagina 1 de tamano 3 (la numeracion de la pagina inicia en 0)
         */
        Page<User> userPage = userRepository.findAll(PageRequest.of(1,3));

        // Retornamos los dos primeros User con nivel 2, ordenado por el atributo registrationDate
        List<User> users = userRepository.findFirst2ByLevel(2, Sort.by("registrationDate"));

        assertAll(
                () -> assertEquals("beth", user1.getUsername()),
                () -> assertEquals("julius", user2.getUsername()),
                () -> assertEquals(2, users.size()),
                () -> assertEquals(3, userPage.getSize()),
                () -> assertEquals("beth", users.get(0).getUsername()),
                () -> assertEquals("marion", users.get(1).getUsername())
        );
    }

    @Test
    void testFIndByLevel(){
        // Definimos un criterio de ordenamiento basado en la clase User
        Sort.TypedSort<User> user = Sort.sort(User.class);

        // Buscamos los usuarios con Level 3 y ordenamos por registrationDate en orden descendente
        List<User> users = userRepository.findByLevel(3, user.by(User::getRegistrationDate).descending());

        assertAll(
                () -> assertEquals(2, users.size()),
                () -> assertEquals("james", users.getFirst().getUsername())
        );
    }

    @Test
    void testFindByActive(){
        /**
         * Buscamos los usuarios active = true, ordenamos por registrationDate
         * Divididos en Paginas. retorna la pagina 1 de tamano 4 (la numeracion comienza en 0)
         */
        List<User> users = userRepository.findByActive(true, PageRequest.of(1,4, Sort.by("registrationDate")));

        assertAll(
                () -> assertEquals(4, users.size()),
                () -> assertEquals("burk", users.get(0).getUsername())
        );
    }
}
