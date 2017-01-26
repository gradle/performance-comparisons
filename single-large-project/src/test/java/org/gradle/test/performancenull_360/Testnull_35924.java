package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35924 {
    private final Productionnull_35924 production = new Productionnull_35924("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}