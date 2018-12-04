/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.demo.service;

/**
 *
 * @author user
 */
import teste.demo.model.User;
import teste.demo.repository.RoleRepository;
import teste.demo.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class UserServiceTest {

    
    private UserRepository mockUserRepository;
    
    private RoleRepository mockRoleRepository;
    
    private BCryptPasswordEncoder mockBCryptPasswordEncoder;

    private UserService userServiceUnderTest;
    private User user;   
}
