package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3076 {
    private final Productionnull_3076 production = new Productionnull_3076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}