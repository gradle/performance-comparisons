package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31925 {
    private final Productionnull_31925 production = new Productionnull_31925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}