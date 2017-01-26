package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40073 {
    private final Productionnull_40073 production = new Productionnull_40073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}