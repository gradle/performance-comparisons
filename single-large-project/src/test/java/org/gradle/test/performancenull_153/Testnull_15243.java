package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15243 {
    private final Productionnull_15243 production = new Productionnull_15243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}