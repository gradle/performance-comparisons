package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3155 {
    private final Productionnull_3155 production = new Productionnull_3155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}