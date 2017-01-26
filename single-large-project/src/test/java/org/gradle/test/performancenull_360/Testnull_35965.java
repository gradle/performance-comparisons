package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35965 {
    private final Productionnull_35965 production = new Productionnull_35965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}