package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22001 {
    private final Productionnull_22001 production = new Productionnull_22001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}