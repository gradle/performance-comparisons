package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28051 {
    private final Productionnull_28051 production = new Productionnull_28051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}