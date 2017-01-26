package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23898 {
    private final Productionnull_23898 production = new Productionnull_23898("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}