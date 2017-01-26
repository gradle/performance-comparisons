package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23943 {
    private final Productionnull_23943 production = new Productionnull_23943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}