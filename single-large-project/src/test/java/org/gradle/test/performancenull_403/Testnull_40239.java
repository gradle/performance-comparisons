package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40239 {
    private final Productionnull_40239 production = new Productionnull_40239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}