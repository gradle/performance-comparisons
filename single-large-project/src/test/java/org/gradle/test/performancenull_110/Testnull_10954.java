package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10954 {
    private final Productionnull_10954 production = new Productionnull_10954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}