package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22270 {
    private final Productionnull_22270 production = new Productionnull_22270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}