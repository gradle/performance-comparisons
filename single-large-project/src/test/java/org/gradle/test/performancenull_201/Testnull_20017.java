package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20017 {
    private final Productionnull_20017 production = new Productionnull_20017("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}