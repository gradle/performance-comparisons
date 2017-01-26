package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30671 {
    private final Productionnull_30671 production = new Productionnull_30671("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}