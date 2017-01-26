package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30669 {
    private final Productionnull_30669 production = new Productionnull_30669("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}