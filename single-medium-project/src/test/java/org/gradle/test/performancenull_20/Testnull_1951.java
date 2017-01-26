package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1951 {
    private final Productionnull_1951 production = new Productionnull_1951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}