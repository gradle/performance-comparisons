package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23374 {
    private final Productionnull_23374 production = new Productionnull_23374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}