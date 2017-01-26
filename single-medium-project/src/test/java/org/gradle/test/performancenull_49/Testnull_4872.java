package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4872 {
    private final Productionnull_4872 production = new Productionnull_4872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}