package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14006 {
    private final Productionnull_14006 production = new Productionnull_14006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}