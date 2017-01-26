package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3199 {
    private final Productionnull_3199 production = new Productionnull_3199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}