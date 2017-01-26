package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32925 {
    private final Productionnull_32925 production = new Productionnull_32925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}