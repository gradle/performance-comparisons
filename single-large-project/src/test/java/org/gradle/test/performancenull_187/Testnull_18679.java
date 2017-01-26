package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18679 {
    private final Productionnull_18679 production = new Productionnull_18679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}