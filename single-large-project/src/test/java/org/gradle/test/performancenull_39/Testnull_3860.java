package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3860 {
    private final Productionnull_3860 production = new Productionnull_3860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}