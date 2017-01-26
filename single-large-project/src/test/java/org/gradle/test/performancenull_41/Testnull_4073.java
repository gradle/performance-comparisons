package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4073 {
    private final Productionnull_4073 production = new Productionnull_4073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}