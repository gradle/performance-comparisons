package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25290 {
    private final Productionnull_25290 production = new Productionnull_25290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}