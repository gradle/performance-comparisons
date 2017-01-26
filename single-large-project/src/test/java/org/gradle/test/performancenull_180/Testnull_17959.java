package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17959 {
    private final Productionnull_17959 production = new Productionnull_17959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}