package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31986 {
    private final Productionnull_31986 production = new Productionnull_31986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}