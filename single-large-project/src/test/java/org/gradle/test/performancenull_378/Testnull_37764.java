package org.gradle.test.performancenull_378;

import static org.junit.Assert.*;

public class Testnull_37764 {
    private final Productionnull_37764 production = new Productionnull_37764("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}