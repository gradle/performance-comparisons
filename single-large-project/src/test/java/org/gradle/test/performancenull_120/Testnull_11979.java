package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11979 {
    private final Productionnull_11979 production = new Productionnull_11979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}