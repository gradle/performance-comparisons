package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39948 {
    private final Productionnull_39948 production = new Productionnull_39948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}