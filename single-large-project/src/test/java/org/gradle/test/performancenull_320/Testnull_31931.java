package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31931 {
    private final Productionnull_31931 production = new Productionnull_31931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}