package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3054 {
    private final Productionnull_3054 production = new Productionnull_3054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}