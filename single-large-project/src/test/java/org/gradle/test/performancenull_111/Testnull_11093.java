package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11093 {
    private final Productionnull_11093 production = new Productionnull_11093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}