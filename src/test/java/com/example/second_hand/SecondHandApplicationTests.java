package com.example.second_hand;

import com.example.second_hand.models.User;
import com.example.second_hand.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class SecondHandApplicationTests {
    private static final String email = "budima2003@mail.ru";
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }


}
