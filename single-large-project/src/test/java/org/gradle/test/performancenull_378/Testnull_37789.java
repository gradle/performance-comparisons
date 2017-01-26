package org.gradle.test.performancenull_378;

import static org.junit.Assert.*;

public class Testnull_37789 {
    private final Productionnull_37789 production = new Productionnull_37789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}