package org.gradle.test.performancenull_497;

import static org.junit.Assert.*;

public class Testnull_49601 {
    private final Productionnull_49601 production = new Productionnull_49601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}