package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42241 {
    private final Productionnull_42241 production = new Productionnull_42241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}