package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12455 {
    private final Productionnull_12455 production = new Productionnull_12455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}