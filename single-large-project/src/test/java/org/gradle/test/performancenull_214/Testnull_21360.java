package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21360 {
    private final Productionnull_21360 production = new Productionnull_21360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}