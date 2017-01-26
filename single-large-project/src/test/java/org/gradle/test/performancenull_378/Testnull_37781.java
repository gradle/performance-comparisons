package org.gradle.test.performancenull_378;

import static org.junit.Assert.*;

public class Testnull_37781 {
    private final Productionnull_37781 production = new Productionnull_37781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}