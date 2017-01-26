package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32663 {
    private final Productionnull_32663 production = new Productionnull_32663("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}