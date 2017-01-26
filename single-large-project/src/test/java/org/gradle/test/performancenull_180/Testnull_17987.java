package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17987 {
    private final Productionnull_17987 production = new Productionnull_17987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}