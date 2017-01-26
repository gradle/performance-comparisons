package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6382 {
    private final Productionnull_6382 production = new Productionnull_6382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}