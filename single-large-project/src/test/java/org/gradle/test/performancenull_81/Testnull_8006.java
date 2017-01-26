package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8006 {
    private final Productionnull_8006 production = new Productionnull_8006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}