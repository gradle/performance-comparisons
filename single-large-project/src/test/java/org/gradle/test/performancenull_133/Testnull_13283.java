package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13283 {
    private final Productionnull_13283 production = new Productionnull_13283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}