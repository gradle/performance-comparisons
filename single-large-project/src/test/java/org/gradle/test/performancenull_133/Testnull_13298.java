package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13298 {
    private final Productionnull_13298 production = new Productionnull_13298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}