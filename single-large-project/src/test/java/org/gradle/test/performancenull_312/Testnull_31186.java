package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31186 {
    private final Productionnull_31186 production = new Productionnull_31186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}