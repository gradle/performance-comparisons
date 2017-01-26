package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4909 {
    private final Productionnull_4909 production = new Productionnull_4909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}