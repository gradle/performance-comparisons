package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10098 {
    private final Productionnull_10098 production = new Productionnull_10098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}