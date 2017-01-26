package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6500 {
    private final Productionnull_6500 production = new Productionnull_6500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}