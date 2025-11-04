package net.engineeringdigest.journalApp.service;

import net.bytebuddy.asm.Advice;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

@Disabled
public class UserDetailsServiceImplTests {

    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

//    @Test
    void loadUserByUsernameTest(){
    when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("owl").password("hagbak").roles(new ArrayList<>()).build());
        UserDetails user = userDetailsService.loadUserByUsername("owl");
        Assertions.assertNotNull(user);
    }
}
