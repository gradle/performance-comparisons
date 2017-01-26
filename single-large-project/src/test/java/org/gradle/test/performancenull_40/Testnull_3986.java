package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3986 {
    private final Productionnull_3986 production = new Productionnull_3986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}