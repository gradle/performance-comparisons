package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49244 {
    private final Productionnull_49244 production = new Productionnull_49244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}