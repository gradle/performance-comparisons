package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49148 {
    private final Productionnull_49148 production = new Productionnull_49148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}