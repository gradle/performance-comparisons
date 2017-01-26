package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20192 {
    private final Productionnull_20192 production = new Productionnull_20192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}