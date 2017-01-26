package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11462 {
    private final Productionnull_11462 production = new Productionnull_11462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}