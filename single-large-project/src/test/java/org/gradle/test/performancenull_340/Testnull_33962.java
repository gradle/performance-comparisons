package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33962 {
    private final Productionnull_33962 production = new Productionnull_33962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}