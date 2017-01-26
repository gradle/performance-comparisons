package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20502 {
    private final Productionnull_20502 production = new Productionnull_20502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}