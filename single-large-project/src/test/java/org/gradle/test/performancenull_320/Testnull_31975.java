package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31975 {
    private final Productionnull_31975 production = new Productionnull_31975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}