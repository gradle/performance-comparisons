package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33445 {
    private final Productionnull_33445 production = new Productionnull_33445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}