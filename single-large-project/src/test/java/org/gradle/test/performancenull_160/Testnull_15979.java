package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15979 {
    private final Productionnull_15979 production = new Productionnull_15979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}