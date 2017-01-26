package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34482 {
    private final Productionnull_34482 production = new Productionnull_34482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}