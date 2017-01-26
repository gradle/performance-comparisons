package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10970 {
    private final Productionnull_10970 production = new Productionnull_10970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}