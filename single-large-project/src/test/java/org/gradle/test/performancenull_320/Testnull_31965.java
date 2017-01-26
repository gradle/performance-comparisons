package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31965 {
    private final Productionnull_31965 production = new Productionnull_31965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}