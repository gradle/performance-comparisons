package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3121 {
    private final Productionnull_3121 production = new Productionnull_3121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}