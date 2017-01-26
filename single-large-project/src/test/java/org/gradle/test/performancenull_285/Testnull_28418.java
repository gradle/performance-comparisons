package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28418 {
    private final Productionnull_28418 production = new Productionnull_28418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}