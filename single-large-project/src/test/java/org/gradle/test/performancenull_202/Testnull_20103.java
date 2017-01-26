package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20103 {
    private final Productionnull_20103 production = new Productionnull_20103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}