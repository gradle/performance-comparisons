package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40596 {
    private final Productionnull_40596 production = new Productionnull_40596("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}