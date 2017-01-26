package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_468 {
    private final Productionnull_468 production = new Productionnull_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}