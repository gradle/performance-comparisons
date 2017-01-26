package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17144 {
    private final Productionnull_17144 production = new Productionnull_17144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}