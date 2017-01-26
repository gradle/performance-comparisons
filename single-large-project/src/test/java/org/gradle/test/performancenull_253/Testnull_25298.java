package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25298 {
    private final Productionnull_25298 production = new Productionnull_25298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}