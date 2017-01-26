package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17925 {
    private final Productionnull_17925 production = new Productionnull_17925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}