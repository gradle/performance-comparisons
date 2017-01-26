package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35956 {
    private final Productionnull_35956 production = new Productionnull_35956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}