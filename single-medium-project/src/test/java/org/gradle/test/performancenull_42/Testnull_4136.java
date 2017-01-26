package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4136 {
    private final Productionnull_4136 production = new Productionnull_4136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}