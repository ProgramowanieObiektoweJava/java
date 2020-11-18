/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.TestCase.assertEquals;

/**
 *
 * @author Ice
 */
public class FactoryTest {
    
    public FactoryTest() {
    }
    
    @org.junit.Test
    void test1(){
        assertEquals(AnimalFactory.make("Cat", "FajneImie"), "/Mammal/Cat: FajneImie");
    }

}
