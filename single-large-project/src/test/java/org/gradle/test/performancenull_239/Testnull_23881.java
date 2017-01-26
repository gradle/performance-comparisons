package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23881 {
    private final Productionnull_23881 production = new Productionnull_23881("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}