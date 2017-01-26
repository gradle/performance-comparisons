package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17931 {
    private final Productionnull_17931 production = new Productionnull_17931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}