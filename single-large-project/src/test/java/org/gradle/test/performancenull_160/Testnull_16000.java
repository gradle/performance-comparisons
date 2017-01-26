package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_16000 {
    private final Productionnull_16000 production = new Productionnull_16000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}