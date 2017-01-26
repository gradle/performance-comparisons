package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5481 {
    private final Productionnull_5481 production = new Productionnull_5481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}