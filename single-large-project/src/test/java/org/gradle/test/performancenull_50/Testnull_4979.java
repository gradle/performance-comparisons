package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4979 {
    private final Productionnull_4979 production = new Productionnull_4979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}