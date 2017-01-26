package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20477 {
    private final Productionnull_20477 production = new Productionnull_20477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}