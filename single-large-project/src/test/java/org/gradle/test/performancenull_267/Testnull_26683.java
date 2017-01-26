package org.gradle.test.performancenull_267;

import static org.junit.Assert.*;

public class Testnull_26683 {
    private final Productionnull_26683 production = new Productionnull_26683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}