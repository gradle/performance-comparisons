package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14097 {
    private final Productionnull_14097 production = new Productionnull_14097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}