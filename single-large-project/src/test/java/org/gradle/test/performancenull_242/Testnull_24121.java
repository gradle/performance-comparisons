package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24121 {
    private final Productionnull_24121 production = new Productionnull_24121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}