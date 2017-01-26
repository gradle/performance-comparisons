package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20158 {
    private final Productionnull_20158 production = new Productionnull_20158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}