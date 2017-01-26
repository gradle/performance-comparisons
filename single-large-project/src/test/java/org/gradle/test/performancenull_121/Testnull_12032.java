package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12032 {
    private final Productionnull_12032 production = new Productionnull_12032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}