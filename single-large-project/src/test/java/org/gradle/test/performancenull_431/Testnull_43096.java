package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43096 {
    private final Productionnull_43096 production = new Productionnull_43096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}