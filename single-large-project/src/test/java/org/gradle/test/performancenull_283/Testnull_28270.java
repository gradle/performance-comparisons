package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28270 {
    private final Productionnull_28270 production = new Productionnull_28270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}