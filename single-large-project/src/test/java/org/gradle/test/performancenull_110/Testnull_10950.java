package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10950 {
    private final Productionnull_10950 production = new Productionnull_10950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}