package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3080 {
    private final Productionnull_3080 production = new Productionnull_3080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}