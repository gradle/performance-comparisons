package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18135 {
    private final Productionnull_18135 production = new Productionnull_18135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}