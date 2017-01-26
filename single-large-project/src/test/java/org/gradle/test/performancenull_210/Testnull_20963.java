package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20963 {
    private final Productionnull_20963 production = new Productionnull_20963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}