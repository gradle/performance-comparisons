package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40181 {
    private final Productionnull_40181 production = new Productionnull_40181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}