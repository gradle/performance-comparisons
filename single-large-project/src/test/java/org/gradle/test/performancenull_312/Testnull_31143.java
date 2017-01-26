package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31143 {
    private final Productionnull_31143 production = new Productionnull_31143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}