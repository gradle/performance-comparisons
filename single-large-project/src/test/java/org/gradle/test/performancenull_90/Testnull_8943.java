package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8943 {
    private final Productionnull_8943 production = new Productionnull_8943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}