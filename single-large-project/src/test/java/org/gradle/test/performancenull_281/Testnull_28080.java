package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28080 {
    private final Productionnull_28080 production = new Productionnull_28080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}