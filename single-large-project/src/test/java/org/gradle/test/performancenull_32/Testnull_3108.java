package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3108 {
    private final Productionnull_3108 production = new Productionnull_3108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}