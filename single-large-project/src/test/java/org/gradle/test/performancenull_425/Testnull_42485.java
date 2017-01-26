package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42485 {
    private final Productionnull_42485 production = new Productionnull_42485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}