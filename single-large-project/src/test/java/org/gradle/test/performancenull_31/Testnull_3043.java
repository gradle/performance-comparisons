package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3043 {
    private final Productionnull_3043 production = new Productionnull_3043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}