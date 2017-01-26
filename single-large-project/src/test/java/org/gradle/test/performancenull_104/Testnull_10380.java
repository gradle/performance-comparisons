package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10380 {
    private final Productionnull_10380 production = new Productionnull_10380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}