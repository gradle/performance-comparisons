package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5919 {
    private final Productionnull_5919 production = new Productionnull_5919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}