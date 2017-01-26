package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_942 {
    private final Productionnull_942 production = new Productionnull_942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}