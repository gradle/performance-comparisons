package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17049 {
    private final Productionnull_17049 production = new Productionnull_17049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}