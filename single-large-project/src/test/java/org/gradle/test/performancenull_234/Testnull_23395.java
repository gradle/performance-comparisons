package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23395 {
    private final Productionnull_23395 production = new Productionnull_23395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}