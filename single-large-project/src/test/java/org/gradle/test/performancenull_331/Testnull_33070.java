package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33070 {
    private final Productionnull_33070 production = new Productionnull_33070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}