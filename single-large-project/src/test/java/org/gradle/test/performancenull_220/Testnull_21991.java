package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21991 {
    private final Productionnull_21991 production = new Productionnull_21991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}