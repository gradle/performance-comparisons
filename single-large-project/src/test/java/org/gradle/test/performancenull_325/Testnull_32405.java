package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32405 {
    private final Productionnull_32405 production = new Productionnull_32405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}