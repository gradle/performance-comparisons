package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30633 {
    private final Productionnull_30633 production = new Productionnull_30633("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}