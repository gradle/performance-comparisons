package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47967 {
    private final Productionnull_47967 production = new Productionnull_47967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}