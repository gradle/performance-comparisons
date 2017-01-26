package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17185 {
    private final Productionnull_17185 production = new Productionnull_17185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}