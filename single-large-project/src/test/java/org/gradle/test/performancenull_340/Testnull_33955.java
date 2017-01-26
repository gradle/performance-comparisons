package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33955 {
    private final Productionnull_33955 production = new Productionnull_33955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}