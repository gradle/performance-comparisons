package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24200 {
    private final Productionnull_24200 production = new Productionnull_24200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}