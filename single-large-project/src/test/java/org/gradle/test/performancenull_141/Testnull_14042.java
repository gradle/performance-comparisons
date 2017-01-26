package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14042 {
    private final Productionnull_14042 production = new Productionnull_14042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}