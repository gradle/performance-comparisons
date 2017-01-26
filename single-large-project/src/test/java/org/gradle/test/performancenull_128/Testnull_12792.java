package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12792 {
    private final Productionnull_12792 production = new Productionnull_12792("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}