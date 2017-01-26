package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20982 {
    private final Productionnull_20982 production = new Productionnull_20982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}