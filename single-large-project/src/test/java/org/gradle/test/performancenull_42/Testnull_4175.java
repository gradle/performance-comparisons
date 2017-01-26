package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4175 {
    private final Productionnull_4175 production = new Productionnull_4175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}