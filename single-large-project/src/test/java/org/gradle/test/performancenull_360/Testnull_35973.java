package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35973 {
    private final Productionnull_35973 production = new Productionnull_35973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}