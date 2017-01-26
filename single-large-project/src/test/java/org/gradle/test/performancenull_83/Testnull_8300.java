package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8300 {
    private final Productionnull_8300 production = new Productionnull_8300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}