package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34296 {
    private final Productionnull_34296 production = new Productionnull_34296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}