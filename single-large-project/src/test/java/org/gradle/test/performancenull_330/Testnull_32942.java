package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32942 {
    private final Productionnull_32942 production = new Productionnull_32942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}