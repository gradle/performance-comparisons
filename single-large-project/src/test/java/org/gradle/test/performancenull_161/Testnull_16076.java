package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16076 {
    private final Productionnull_16076 production = new Productionnull_16076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}