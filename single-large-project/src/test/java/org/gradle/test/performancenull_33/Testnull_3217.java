package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3217 {
    private final Productionnull_3217 production = new Productionnull_3217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}