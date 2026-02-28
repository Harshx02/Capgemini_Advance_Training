package com.capg.JUnit4.Mockito.Maven5_Junit4_Mockito;
import static org.junit.Assert.assertEquals;
//Enables Mockito
/*
 With Mockito (Advantage)
No database needed
Fast execution
Tests only business logic
 * 
 */
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    //Creates mock object
    @Mock
    private UserDAO userDao;   // Mocked dependency
    //Injects mock into service
    @InjectMocks
    private UserService userService; // Class under test

    @Test
    public void testGetUsername() {
               
        // Step 1: Define mock behavior
        when(userDao.findUsernamebyId(1)).thenReturn("Ram");

        // Step 2: Call service method
        String result = userService.getUserName(1);

        // Step 3: Verify result
        assertEquals("Ram", result);
              //Verifies method call
        // Step 4: Verify interaction
        verify(userDao).findUsernamebyId(1);
    }
}