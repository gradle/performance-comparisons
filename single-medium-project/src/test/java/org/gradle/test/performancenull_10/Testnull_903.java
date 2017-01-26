package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_903 {
    private final Productionnull_903 production = new Productionnull_903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}