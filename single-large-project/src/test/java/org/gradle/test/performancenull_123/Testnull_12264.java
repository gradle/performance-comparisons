package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12264 {
    private final Productionnull_12264 production = new Productionnull_12264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}