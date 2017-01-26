package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32922 {
    private final Productionnull_32922 production = new Productionnull_32922("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}