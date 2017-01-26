package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35991 {
    private final Productionnull_35991 production = new Productionnull_35991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}