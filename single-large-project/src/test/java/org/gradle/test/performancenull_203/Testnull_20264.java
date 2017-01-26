package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20264 {
    private final Productionnull_20264 production = new Productionnull_20264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}