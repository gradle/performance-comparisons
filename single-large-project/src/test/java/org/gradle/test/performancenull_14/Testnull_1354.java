package org.gradle.test.performancenull_14;

import static org.junit.Assert.*;

public class Testnull_1354 {
    private final Productionnull_1354 production = new Productionnull_1354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}