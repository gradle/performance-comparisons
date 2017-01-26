package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23980 {
    private final Productionnull_23980 production = new Productionnull_23980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}