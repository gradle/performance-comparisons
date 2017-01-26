package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32975 {
    private final Productionnull_32975 production = new Productionnull_32975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}