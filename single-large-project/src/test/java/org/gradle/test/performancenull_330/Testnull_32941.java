package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32941 {
    private final Productionnull_32941 production = new Productionnull_32941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}