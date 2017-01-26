package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30604 {
    private final Productionnull_30604 production = new Productionnull_30604("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}