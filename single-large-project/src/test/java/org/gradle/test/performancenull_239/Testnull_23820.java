package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23820 {
    private final Productionnull_23820 production = new Productionnull_23820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}