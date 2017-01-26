package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5943 {
    private final Productionnull_5943 production = new Productionnull_5943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}