package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1462 {
    private final Productionnull_1462 production = new Productionnull_1462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}