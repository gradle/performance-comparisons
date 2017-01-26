package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7418 {
    private final Productionnull_7418 production = new Productionnull_7418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}