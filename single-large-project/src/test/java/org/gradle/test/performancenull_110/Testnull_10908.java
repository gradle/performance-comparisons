package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10908 {
    private final Productionnull_10908 production = new Productionnull_10908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}