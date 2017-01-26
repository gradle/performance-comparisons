package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5202 {
    private final Productionnull_5202 production = new Productionnull_5202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}