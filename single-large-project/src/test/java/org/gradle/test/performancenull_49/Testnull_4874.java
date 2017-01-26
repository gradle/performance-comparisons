package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4874 {
    private final Productionnull_4874 production = new Productionnull_4874("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}