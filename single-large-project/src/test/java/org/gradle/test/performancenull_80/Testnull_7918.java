package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7918 {
    private final Productionnull_7918 production = new Productionnull_7918("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}