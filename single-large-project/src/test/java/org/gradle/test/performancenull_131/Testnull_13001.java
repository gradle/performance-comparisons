package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13001 {
    private final Productionnull_13001 production = new Productionnull_13001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}