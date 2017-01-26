package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19170 {
    private final Productionnull_19170 production = new Productionnull_19170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}