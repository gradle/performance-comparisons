package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29988 {
    private final Productionnull_29988 production = new Productionnull_29988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}