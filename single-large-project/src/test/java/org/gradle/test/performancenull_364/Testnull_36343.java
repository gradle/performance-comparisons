package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36343 {
    private final Productionnull_36343 production = new Productionnull_36343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}