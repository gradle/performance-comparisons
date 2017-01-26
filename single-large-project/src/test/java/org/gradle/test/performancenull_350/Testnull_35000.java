package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_35000 {
    private final Productionnull_35000 production = new Productionnull_35000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}