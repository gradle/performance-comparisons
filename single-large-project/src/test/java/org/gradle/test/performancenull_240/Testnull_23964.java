package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23964 {
    private final Productionnull_23964 production = new Productionnull_23964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}