package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30678 {
    private final Productionnull_30678 production = new Productionnull_30678("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}