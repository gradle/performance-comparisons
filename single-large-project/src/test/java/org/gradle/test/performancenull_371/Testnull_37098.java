package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37098 {
    private final Productionnull_37098 production = new Productionnull_37098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}