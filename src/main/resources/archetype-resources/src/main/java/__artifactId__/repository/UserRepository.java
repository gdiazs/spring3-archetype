#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * Copyright (C) 10 feb. 2017 Guillermo Díaz Solís.
 * Todos los derechos reservados.
 */
package ${package}.${artifactId}.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ${package}.${artifactId}.domain.User;


/**
 * 
 * @author Guillermo B Díaz Solís
 * @since 11 feb. 2017
 * @version 1.0
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  public User findUserByUsername(String userName);
}
