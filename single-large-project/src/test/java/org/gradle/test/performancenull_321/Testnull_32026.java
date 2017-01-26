package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32026 {
    private final Productionnull_32026 production = new Productionnull_32026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}