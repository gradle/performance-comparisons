package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16943 {
    private final Productionnull_16943 production = new Productionnull_16943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}