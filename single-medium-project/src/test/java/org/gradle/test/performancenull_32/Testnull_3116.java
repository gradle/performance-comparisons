package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3116 {
    private final Productionnull_3116 production = new Productionnull_3116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}