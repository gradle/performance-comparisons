package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35945 {
    private final Productionnull_35945 production = new Productionnull_35945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}