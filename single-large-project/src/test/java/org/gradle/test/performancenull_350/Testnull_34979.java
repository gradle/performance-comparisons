package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34979 {
    private final Productionnull_34979 production = new Productionnull_34979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}