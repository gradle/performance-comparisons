package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3096 {
    private final Productionnull_3096 production = new Productionnull_3096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}