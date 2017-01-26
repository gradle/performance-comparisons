package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23962 {
    private final Productionnull_23962 production = new Productionnull_23962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}