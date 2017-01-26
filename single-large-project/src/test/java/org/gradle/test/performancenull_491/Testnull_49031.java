package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49031 {
    private final Productionnull_49031 production = new Productionnull_49031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}