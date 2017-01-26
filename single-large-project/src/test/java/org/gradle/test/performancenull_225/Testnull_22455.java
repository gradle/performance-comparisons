package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22455 {
    private final Productionnull_22455 production = new Productionnull_22455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}