package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8083 {
    private final Productionnull_8083 production = new Productionnull_8083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}