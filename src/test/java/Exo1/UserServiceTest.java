package Exo1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class UserServiceTest {

    @Test
    public void testGetUserById() {

        UserRepository mockRepository = mock(UserRepository.class);

        Utilisateur testUser = new Utilisateur();
        testUser.setId(55);
        testUser.setName("Behaz Chaouki");

        when(mockRepository.findUserById(55)).thenReturn(testUser);


        UserService userService = new UserService();
        userService.setUR(mockRepository);
        Utilisateur retrievedUser = userService.getUserById(55);

        // Vérification
        assertEquals("Behaz Chaouki", retrievedUser.getName());

        verify(mockRepository).findUserById(testUser.getId());
    }
}
