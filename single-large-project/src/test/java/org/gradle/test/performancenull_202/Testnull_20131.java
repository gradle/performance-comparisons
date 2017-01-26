package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20131 {
    private final Productionnull_20131 production = new Productionnull_20131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}