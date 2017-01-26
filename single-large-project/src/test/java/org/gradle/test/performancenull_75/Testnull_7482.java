package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7482 {
    private final Productionnull_7482 production = new Productionnull_7482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}