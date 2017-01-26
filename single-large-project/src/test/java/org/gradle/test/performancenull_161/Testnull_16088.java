package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16088 {
    private final Productionnull_16088 production = new Productionnull_16088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}