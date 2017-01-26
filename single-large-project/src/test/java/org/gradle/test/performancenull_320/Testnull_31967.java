package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31967 {
    private final Productionnull_31967 production = new Productionnull_31967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}