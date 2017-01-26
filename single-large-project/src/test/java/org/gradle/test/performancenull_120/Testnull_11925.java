package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11925 {
    private final Productionnull_11925 production = new Productionnull_11925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}