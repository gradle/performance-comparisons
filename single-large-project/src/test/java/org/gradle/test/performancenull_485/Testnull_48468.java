package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48468 {
    private final Productionnull_48468 production = new Productionnull_48468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}