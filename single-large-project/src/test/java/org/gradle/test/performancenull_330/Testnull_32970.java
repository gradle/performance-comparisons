package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32970 {
    private final Productionnull_32970 production = new Productionnull_32970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}