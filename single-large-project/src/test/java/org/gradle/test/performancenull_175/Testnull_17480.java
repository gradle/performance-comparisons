package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17480 {
    private final Productionnull_17480 production = new Productionnull_17480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}