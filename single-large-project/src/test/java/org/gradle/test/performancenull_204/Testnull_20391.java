package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20391 {
    private final Productionnull_20391 production = new Productionnull_20391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}