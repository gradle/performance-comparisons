package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20547 {
    private final Productionnull_20547 production = new Productionnull_20547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}