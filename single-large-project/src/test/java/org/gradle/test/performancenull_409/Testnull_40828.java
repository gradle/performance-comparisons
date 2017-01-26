package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40828 {
    private final Productionnull_40828 production = new Productionnull_40828("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}