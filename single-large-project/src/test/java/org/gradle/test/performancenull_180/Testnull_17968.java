package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17968 {
    private final Productionnull_17968 production = new Productionnull_17968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}