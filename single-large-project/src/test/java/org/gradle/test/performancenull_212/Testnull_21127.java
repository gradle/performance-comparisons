package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21127 {
    private final Productionnull_21127 production = new Productionnull_21127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}