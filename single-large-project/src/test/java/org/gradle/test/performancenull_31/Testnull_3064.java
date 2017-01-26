package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3064 {
    private final Productionnull_3064 production = new Productionnull_3064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}