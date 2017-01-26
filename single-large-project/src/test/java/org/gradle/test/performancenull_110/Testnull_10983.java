package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10983 {
    private final Productionnull_10983 production = new Productionnull_10983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}