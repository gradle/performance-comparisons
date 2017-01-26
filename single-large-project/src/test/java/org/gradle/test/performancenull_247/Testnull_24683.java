package org.gradle.test.performancenull_247;

import static org.junit.Assert.*;

public class Testnull_24683 {
    private final Productionnull_24683 production = new Productionnull_24683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}