package com.ceva.javapersistence.springdatajpa;

import com.ceva.javapersistence.springdatajpa.model.User;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Query methods returning more than one result can use standard Java interfaces such
 * as Iterable, List, Set. Additionally, Spring Data supports Streamable, which can be
 * used as an alternative to Iterable or any collection type. You can concatenate
 * Streamables and directly filter and map over the elements
 */
public class QueryResultsTest extends SpringdatajpaApplicationTests{
    @Test
    void testStreamable(){
        // buscamos emails que contengan someother
        try(Stream<User> result =
                    userRepository.findByEmailContaining("someother")
                            // concatenamos el primer resultado con los usuarios de nivel 2
                            .and(userRepository.findByLevel(2))
                            // convertimos a stream
                            // evitamos duplicados
                            .stream()
                            .distinct())
        {
            assertEquals(6, result.count());
        }
    }
}
