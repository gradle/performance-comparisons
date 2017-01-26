package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1150 {
    private final Productionnull_1150 production = new Productionnull_1150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}