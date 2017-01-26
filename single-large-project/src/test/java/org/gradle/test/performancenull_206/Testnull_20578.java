package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20578 {
    private final Productionnull_20578 production = new Productionnull_20578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}