package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12620 {
    private final Productionnull_12620 production = new Productionnull_12620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}