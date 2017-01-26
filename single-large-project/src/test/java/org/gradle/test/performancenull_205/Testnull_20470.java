package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20470 {
    private final Productionnull_20470 production = new Productionnull_20470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}