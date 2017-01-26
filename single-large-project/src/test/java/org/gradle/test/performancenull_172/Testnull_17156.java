package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17156 {
    private final Productionnull_17156 production = new Productionnull_17156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}