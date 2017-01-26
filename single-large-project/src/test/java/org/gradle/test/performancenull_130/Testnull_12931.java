package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12931 {
    private final Productionnull_12931 production = new Productionnull_12931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}