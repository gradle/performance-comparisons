package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40259 {
    private final Productionnull_40259 production = new Productionnull_40259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}