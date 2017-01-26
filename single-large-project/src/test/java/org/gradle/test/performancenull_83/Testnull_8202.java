package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8202 {
    private final Productionnull_8202 production = new Productionnull_8202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}