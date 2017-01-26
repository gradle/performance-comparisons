package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20151 {
    private final Productionnull_20151 production = new Productionnull_20151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}