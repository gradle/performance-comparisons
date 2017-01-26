package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10916 {
    private final Productionnull_10916 production = new Productionnull_10916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}