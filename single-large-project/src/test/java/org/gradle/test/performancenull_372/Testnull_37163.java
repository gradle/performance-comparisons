package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37163 {
    private final Productionnull_37163 production = new Productionnull_37163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}