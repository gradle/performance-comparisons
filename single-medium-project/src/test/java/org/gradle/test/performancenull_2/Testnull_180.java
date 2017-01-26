package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_180 {
    private final Productionnull_180 production = new Productionnull_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}