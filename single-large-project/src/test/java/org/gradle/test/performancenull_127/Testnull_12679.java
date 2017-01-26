package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12679 {
    private final Productionnull_12679 production = new Productionnull_12679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}