package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3862 {
    private final Productionnull_3862 production = new Productionnull_3862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}