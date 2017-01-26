package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34219 {
    private final Productionnull_34219 production = new Productionnull_34219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}