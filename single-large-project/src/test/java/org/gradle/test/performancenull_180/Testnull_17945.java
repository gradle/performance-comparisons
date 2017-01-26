package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17945 {
    private final Productionnull_17945 production = new Productionnull_17945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}