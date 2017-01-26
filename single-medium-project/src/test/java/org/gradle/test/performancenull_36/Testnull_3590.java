package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3590 {
    private final Productionnull_3590 production = new Productionnull_3590("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}