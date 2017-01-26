package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3366 {
    private final Productionnull_3366 production = new Productionnull_3366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}