package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4964 {
    private final Productionnull_4964 production = new Productionnull_4964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}