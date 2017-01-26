package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32029 {
    private final Productionnull_32029 production = new Productionnull_32029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}