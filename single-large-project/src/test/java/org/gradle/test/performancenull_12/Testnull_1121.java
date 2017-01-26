package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1121 {
    private final Productionnull_1121 production = new Productionnull_1121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}