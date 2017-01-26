package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20446 {
    private final Productionnull_20446 production = new Productionnull_20446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}