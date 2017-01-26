package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35992 {
    private final Productionnull_35992 production = new Productionnull_35992("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}