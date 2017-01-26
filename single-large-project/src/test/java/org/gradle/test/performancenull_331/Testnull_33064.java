package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33064 {
    private final Productionnull_33064 production = new Productionnull_33064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}