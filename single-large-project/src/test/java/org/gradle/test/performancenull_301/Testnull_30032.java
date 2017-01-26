package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30032 {
    private final Productionnull_30032 production = new Productionnull_30032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}