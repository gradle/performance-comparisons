package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2481 {
    private final Productionnull_2481 production = new Productionnull_2481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}