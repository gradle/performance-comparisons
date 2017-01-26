package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18069 {
    private final Productionnull_18069 production = new Productionnull_18069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}