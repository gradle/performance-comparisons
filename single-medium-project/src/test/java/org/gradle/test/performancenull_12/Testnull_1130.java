package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1130 {
    private final Productionnull_1130 production = new Productionnull_1130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}