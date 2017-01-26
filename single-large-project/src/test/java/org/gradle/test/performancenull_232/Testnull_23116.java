package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23116 {
    private final Productionnull_23116 production = new Productionnull_23116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}