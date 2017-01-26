package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42354 {
    private final Productionnull_42354 production = new Productionnull_42354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}