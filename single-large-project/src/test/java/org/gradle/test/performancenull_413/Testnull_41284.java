package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41284 {
    private final Productionnull_41284 production = new Productionnull_41284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}