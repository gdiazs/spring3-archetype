#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * Copyright (C) 11 feb. 2017 Guillermo Díaz Solís.
 * Todos los derechos reservados.
 */
package ${package}.sample${artifactId}.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import ${package}.${artifactId}.RootConfig;
import ${package}.${artifactId}.domain.User;

/**
 * @author Guillermo B Díaz Solís
 * @since 11 feb. 2017
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class,
    loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("dev")
public class UserRepositoryTest {

  @Autowired
  private UserDetailsService userdetailService;

  /**
   * Test method for {@link ${package}.${artifactId}.repository.UserRepository${symbol_pound}findUserByUsername(java.lang.String)}.
   */
  @Test
  public void testFindUserByUsername() {
    User user =  (User) userdetailService.loadUserByUsername("admin");
    System.out.println(user);
  }

}
