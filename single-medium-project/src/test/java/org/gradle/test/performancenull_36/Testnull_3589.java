package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3589 {
    private final Productionnull_3589 production = new Productionnull_3589("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}