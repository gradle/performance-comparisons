package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10972 {
    private final Productionnull_10972 production = new Productionnull_10972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}