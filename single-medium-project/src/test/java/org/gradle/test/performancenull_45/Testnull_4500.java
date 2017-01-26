package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4500 {
    private final Productionnull_4500 production = new Productionnull_4500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}