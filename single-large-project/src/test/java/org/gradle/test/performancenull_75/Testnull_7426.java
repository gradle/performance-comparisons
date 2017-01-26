package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7426 {
    private final Productionnull_7426 production = new Productionnull_7426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}