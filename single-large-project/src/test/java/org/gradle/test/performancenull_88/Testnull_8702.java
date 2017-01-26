package org.gradle.test.performancenull_88;

import static org.junit.Assert.*;

public class Testnull_8702 {
    private final Productionnull_8702 production = new Productionnull_8702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}