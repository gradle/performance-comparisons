package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42482 {
    private final Productionnull_42482 production = new Productionnull_42482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}