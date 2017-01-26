package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36278 {
    private final Productionnull_36278 production = new Productionnull_36278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}