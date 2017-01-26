package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10982 {
    private final Productionnull_10982 production = new Productionnull_10982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}