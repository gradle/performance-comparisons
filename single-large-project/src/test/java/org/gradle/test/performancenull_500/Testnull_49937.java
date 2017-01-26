package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49937 {
    private final Productionnull_49937 production = new Productionnull_49937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}