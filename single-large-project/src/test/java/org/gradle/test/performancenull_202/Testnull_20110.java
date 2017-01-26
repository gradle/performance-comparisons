package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20110 {
    private final Productionnull_20110 production = new Productionnull_20110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}