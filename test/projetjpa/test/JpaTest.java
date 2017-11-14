package projetjpa.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class JpaTest {
    
    @Test
    public void JpaTest() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    }
    
}
