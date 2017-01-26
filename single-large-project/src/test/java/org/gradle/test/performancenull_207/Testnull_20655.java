package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20655 {
    private final Productionnull_20655 production = new Productionnull_20655("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}