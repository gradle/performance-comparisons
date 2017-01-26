package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46161 {
    private final Productionnull_46161 production = new Productionnull_46161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}