package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8942 {
    private final Productionnull_8942 production = new Productionnull_8942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}