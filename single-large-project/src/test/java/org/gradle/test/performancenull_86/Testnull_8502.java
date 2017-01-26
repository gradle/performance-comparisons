package org.gradle.test.performancenull_86;

import static org.junit.Assert.*;

public class Testnull_8502 {
    private final Productionnull_8502 production = new Productionnull_8502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}