package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21606 {
    private final Productionnull_21606 production = new Productionnull_21606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}