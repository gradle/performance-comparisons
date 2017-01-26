package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19108 {
    private final Productionnull_19108 production = new Productionnull_19108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}