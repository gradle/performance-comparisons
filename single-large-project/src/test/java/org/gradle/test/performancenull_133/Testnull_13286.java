package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13286 {
    private final Productionnull_13286 production = new Productionnull_13286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}