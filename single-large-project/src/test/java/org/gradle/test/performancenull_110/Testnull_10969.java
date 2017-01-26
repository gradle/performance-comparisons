package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10969 {
    private final Productionnull_10969 production = new Productionnull_10969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}