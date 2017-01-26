package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17268 {
    private final Productionnull_17268 production = new Productionnull_17268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}