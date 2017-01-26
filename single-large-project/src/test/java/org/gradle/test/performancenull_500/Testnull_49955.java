package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49955 {
    private final Productionnull_49955 production = new Productionnull_49955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}