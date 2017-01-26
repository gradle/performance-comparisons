package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9446 {
    private final Productionnull_9446 production = new Productionnull_9446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}