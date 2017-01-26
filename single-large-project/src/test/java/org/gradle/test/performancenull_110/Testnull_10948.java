package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10948 {
    private final Productionnull_10948 production = new Productionnull_10948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}