package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40761 {
    private final Productionnull_40761 production = new Productionnull_40761("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}