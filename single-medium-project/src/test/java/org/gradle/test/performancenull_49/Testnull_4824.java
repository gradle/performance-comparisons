package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4824 {
    private final Productionnull_4824 production = new Productionnull_4824("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}