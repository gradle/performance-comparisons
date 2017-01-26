package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10366 {
    private final Productionnull_10366 production = new Productionnull_10366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}