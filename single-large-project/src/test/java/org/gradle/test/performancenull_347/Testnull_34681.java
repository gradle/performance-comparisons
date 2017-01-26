package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34681 {
    private final Productionnull_34681 production = new Productionnull_34681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}