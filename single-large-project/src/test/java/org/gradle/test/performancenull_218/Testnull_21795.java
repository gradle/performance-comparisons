package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21795 {
    private final Productionnull_21795 production = new Productionnull_21795("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}