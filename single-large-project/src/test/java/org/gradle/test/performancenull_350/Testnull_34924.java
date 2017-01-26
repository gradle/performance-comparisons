package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34924 {
    private final Productionnull_34924 production = new Productionnull_34924("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}