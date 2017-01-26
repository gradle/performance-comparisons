package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20185 {
    private final Productionnull_20185 production = new Productionnull_20185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}