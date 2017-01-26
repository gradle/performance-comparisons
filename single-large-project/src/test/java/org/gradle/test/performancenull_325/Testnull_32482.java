package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32482 {
    private final Productionnull_32482 production = new Productionnull_32482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}