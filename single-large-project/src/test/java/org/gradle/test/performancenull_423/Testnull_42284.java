package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42284 {
    private final Productionnull_42284 production = new Productionnull_42284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}