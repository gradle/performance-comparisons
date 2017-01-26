package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21035 {
    private final Productionnull_21035 production = new Productionnull_21035("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}