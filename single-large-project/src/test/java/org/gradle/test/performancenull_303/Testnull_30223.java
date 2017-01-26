package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30223 {
    private final Productionnull_30223 production = new Productionnull_30223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}