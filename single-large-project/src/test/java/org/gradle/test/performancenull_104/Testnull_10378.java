package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10378 {
    private final Productionnull_10378 production = new Productionnull_10378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}