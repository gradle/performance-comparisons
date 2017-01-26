package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28098 {
    private final Productionnull_28098 production = new Productionnull_28098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}