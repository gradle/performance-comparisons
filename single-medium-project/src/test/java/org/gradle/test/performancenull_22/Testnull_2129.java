package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2129 {
    private final Productionnull_2129 production = new Productionnull_2129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}