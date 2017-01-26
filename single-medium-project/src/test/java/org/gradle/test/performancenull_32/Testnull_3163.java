package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3163 {
    private final Productionnull_3163 production = new Productionnull_3163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}