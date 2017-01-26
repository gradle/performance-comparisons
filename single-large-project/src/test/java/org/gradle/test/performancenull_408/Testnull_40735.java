package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40735 {
    private final Productionnull_40735 production = new Productionnull_40735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}