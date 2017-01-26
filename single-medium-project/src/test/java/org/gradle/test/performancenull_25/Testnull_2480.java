package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2480 {
    private final Productionnull_2480 production = new Productionnull_2480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}