package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48348 {
    private final Productionnull_48348 production = new Productionnull_48348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}