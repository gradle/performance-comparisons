package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5086 {
    private final Productionnull_5086 production = new Productionnull_5086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}