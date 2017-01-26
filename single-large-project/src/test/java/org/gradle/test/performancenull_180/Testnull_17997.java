package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17997 {
    private final Productionnull_17997 production = new Productionnull_17997("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}