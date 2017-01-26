package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30148 {
    private final Productionnull_30148 production = new Productionnull_30148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}