package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23870 {
    private final Productionnull_23870 production = new Productionnull_23870("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}