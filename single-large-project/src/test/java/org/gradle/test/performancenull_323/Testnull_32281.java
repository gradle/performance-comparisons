package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32281 {
    private final Productionnull_32281 production = new Productionnull_32281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}