package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3268 {
    private final Productionnull_3268 production = new Productionnull_3268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}