package org.gradle.test.performancenull_378;

import static org.junit.Assert.*;

public class Testnull_37786 {
    private final Productionnull_37786 production = new Productionnull_37786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}