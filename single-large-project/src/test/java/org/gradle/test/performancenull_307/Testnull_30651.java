package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30651 {
    private final Productionnull_30651 production = new Productionnull_30651("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}