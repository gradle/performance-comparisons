package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49982 {
    private final Productionnull_49982 production = new Productionnull_49982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}