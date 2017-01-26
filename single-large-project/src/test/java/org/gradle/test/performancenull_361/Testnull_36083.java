package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36083 {
    private final Productionnull_36083 production = new Productionnull_36083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}