package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7903 {
    private final Productionnull_7903 production = new Productionnull_7903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}