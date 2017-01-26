package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34909 {
    private final Productionnull_34909 production = new Productionnull_34909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}