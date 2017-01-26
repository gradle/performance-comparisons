package org.gradle.test.performancenull_378;

import static org.junit.Assert.*;

public class Testnull_37741 {
    private final Productionnull_37741 production = new Productionnull_37741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}