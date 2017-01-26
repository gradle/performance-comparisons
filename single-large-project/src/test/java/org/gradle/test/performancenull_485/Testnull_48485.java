package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48485 {
    private final Productionnull_48485 production = new Productionnull_48485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}