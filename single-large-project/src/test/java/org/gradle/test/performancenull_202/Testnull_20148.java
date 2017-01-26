package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20148 {
    private final Productionnull_20148 production = new Productionnull_20148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}