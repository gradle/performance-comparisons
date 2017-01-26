package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35978 {
    private final Productionnull_35978 production = new Productionnull_35978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}