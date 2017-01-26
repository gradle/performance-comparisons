package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23801 {
    private final Productionnull_23801 production = new Productionnull_23801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}