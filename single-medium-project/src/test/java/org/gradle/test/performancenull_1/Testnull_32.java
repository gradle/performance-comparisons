package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_32 {
    private final Productionnull_32 production = new Productionnull_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}