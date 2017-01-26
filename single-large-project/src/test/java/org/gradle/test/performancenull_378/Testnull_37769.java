package org.gradle.test.performancenull_378;

import static org.junit.Assert.*;

public class Testnull_37769 {
    private final Productionnull_37769 production = new Productionnull_37769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}