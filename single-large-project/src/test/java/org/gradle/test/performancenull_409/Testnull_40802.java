package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40802 {
    private final Productionnull_40802 production = new Productionnull_40802("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}