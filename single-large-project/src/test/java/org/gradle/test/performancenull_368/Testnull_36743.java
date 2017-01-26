package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36743 {
    private final Productionnull_36743 production = new Productionnull_36743("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}