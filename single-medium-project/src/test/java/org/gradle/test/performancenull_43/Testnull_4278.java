package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4278 {
    private final Productionnull_4278 production = new Productionnull_4278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}