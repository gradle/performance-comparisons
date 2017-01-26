package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_155 {
    private final Productionnull_155 production = new Productionnull_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}