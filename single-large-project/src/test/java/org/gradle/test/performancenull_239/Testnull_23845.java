package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23845 {
    private final Productionnull_23845 production = new Productionnull_23845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}