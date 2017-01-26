package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22082 {
    private final Productionnull_22082 production = new Productionnull_22082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}