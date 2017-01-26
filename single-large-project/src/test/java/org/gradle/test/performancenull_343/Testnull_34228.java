package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34228 {
    private final Productionnull_34228 production = new Productionnull_34228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}