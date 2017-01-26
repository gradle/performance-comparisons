package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23936 {
    private final Productionnull_23936 production = new Productionnull_23936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}