package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10375 {
    private final Productionnull_10375 production = new Productionnull_10375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}