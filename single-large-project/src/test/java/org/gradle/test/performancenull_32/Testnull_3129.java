package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3129 {
    private final Productionnull_3129 production = new Productionnull_3129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}