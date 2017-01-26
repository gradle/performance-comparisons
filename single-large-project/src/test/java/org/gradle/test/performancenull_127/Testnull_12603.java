package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12603 {
    private final Productionnull_12603 production = new Productionnull_12603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}