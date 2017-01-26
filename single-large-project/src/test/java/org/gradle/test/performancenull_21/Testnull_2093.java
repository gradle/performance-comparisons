package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2093 {
    private final Productionnull_2093 production = new Productionnull_2093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}