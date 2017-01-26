package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1104 {
    private final Productionnull_1104 production = new Productionnull_1104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}