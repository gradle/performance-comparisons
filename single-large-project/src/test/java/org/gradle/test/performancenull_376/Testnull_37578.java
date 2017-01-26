package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37578 {
    private final Productionnull_37578 production = new Productionnull_37578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}