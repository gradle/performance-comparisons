package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3144 {
    private final Productionnull_3144 production = new Productionnull_3144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}