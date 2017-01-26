package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32263 {
    private final Productionnull_32263 production = new Productionnull_32263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}