package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12934 {
    private final Productionnull_12934 production = new Productionnull_12934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}