package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3137 {
    private final Productionnull_3137 production = new Productionnull_3137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}