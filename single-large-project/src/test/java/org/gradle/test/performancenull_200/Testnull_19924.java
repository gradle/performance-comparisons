package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19924 {
    private final Productionnull_19924 production = new Productionnull_19924("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}