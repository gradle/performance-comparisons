package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11072 {
    private final Productionnull_11072 production = new Productionnull_11072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}