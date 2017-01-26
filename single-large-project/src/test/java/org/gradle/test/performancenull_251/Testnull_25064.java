package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25064 {
    private final Productionnull_25064 production = new Productionnull_25064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}