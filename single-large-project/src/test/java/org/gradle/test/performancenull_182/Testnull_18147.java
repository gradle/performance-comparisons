package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18147 {
    private final Productionnull_18147 production = new Productionnull_18147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}