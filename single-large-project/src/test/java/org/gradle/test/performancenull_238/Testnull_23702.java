package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23702 {
    private final Productionnull_23702 production = new Productionnull_23702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}