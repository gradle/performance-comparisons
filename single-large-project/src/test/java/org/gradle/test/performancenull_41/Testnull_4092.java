package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4092 {
    private final Productionnull_4092 production = new Productionnull_4092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}