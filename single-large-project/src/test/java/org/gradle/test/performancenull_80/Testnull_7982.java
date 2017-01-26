package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7982 {
    private final Productionnull_7982 production = new Productionnull_7982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}