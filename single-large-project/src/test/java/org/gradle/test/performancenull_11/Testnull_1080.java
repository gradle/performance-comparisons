package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1080 {
    private final Productionnull_1080 production = new Productionnull_1080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}