package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17942 {
    private final Productionnull_17942 production = new Productionnull_17942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}