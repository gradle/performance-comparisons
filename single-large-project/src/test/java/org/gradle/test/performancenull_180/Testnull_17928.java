package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17928 {
    private final Productionnull_17928 production = new Productionnull_17928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}