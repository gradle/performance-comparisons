package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34273 {
    private final Productionnull_34273 production = new Productionnull_34273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}