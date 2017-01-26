package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10147 {
    private final Productionnull_10147 production = new Productionnull_10147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}