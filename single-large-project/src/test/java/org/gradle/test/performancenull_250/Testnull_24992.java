package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24992 {
    private final Productionnull_24992 production = new Productionnull_24992("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}