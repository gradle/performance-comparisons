package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22093 {
    private final Productionnull_22093 production = new Productionnull_22093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}