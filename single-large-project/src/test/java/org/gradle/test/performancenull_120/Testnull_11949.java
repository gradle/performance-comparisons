package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11949 {
    private final Productionnull_11949 production = new Productionnull_11949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}