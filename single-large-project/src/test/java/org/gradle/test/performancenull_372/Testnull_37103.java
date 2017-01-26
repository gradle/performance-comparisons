package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37103 {
    private final Productionnull_37103 production = new Productionnull_37103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}