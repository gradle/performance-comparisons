package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4187 {
    private final Productionnull_4187 production = new Productionnull_4187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}