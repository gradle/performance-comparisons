package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33979 {
    private final Productionnull_33979 production = new Productionnull_33979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}