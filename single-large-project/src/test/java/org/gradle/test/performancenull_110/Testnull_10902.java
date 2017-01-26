package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10902 {
    private final Productionnull_10902 production = new Productionnull_10902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}