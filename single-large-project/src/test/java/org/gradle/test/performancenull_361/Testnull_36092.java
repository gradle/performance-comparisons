package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36092 {
    private final Productionnull_36092 production = new Productionnull_36092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}