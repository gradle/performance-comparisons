package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10956 {
    private final Productionnull_10956 production = new Productionnull_10956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}