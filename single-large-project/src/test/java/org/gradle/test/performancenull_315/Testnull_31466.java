package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31466 {
    private final Productionnull_31466 production = new Productionnull_31466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}