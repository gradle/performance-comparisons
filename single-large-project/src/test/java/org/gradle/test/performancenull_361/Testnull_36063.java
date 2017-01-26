package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36063 {
    private final Productionnull_36063 production = new Productionnull_36063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}