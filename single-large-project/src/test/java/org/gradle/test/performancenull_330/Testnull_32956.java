package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32956 {
    private final Productionnull_32956 production = new Productionnull_32956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}