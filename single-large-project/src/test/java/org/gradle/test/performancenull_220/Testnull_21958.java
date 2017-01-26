package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21958 {
    private final Productionnull_21958 production = new Productionnull_21958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}