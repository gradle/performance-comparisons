package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24979 {
    private final Productionnull_24979 production = new Productionnull_24979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}