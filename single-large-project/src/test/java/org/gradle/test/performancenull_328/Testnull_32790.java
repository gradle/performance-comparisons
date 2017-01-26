package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32790 {
    private final Productionnull_32790 production = new Productionnull_32790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}