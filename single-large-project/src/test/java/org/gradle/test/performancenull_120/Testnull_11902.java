package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11902 {
    private final Productionnull_11902 production = new Productionnull_11902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}