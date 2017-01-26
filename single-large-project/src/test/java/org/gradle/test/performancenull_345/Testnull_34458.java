package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34458 {
    private final Productionnull_34458 production = new Productionnull_34458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}