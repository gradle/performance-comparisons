package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3063 {
    private final Productionnull_3063 production = new Productionnull_3063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}