package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27480 {
    private final Productionnull_27480 production = new Productionnull_27480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}