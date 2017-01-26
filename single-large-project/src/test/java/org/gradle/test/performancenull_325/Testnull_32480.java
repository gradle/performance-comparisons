package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32480 {
    private final Productionnull_32480 production = new Productionnull_32480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}