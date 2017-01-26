package org.gradle.test.performancenull_248;

import static org.junit.Assert.*;

public class Testnull_24790 {
    private final Productionnull_24790 production = new Productionnull_24790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}