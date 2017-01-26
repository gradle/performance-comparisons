package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4093 {
    private final Productionnull_4093 production = new Productionnull_4093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}