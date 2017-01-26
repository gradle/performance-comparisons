package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13382 {
    private final Productionnull_13382 production = new Productionnull_13382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}