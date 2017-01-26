package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42478 {
    private final Productionnull_42478 production = new Productionnull_42478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}