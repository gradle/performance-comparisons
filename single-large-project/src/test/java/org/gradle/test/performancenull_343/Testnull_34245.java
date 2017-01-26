package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34245 {
    private final Productionnull_34245 production = new Productionnull_34245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}