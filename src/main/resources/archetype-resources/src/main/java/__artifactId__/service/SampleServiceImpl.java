#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * Copyright (C) 10 feb. 2017 Guillermo Díaz Solís.
 * Todos los derechos reservados.
 */
package ${package}.${artifactId}.service;

import org.springframework.stereotype.Service;

/**
 * @author Guillermo B Díaz Solís
 * @since 10 feb. 2017
 * @version 1.0
 */
@Service
public class SampleServiceImpl implements SampleService {

  /* (non-Javadoc)
   * @see ${package}.sample${artifactId}.service.SampleService${symbol_pound}sayHello()
   */
  @Override
  public String sayHello() {
    return "Hellow, I'm " + this.getClass().getCanonicalName();
  }

}
