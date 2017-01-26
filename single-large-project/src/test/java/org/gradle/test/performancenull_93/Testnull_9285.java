package org.gradle.test.performancenull_93;

import static org.junit.Assert.*;

public class Testnull_9285 {
    private final Productionnull_9285 production = new Productionnull_9285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}