package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4936 {
    private final Productionnull_4936 production = new Productionnull_4936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}