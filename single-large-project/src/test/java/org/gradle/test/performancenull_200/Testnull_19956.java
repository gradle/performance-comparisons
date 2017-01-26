package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19956 {
    private final Productionnull_19956 production = new Productionnull_19956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}