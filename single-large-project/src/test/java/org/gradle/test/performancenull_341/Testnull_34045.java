package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34045 {
    private final Productionnull_34045 production = new Productionnull_34045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}