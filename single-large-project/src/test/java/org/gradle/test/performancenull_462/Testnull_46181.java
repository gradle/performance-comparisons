package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46181 {
    private final Productionnull_46181 production = new Productionnull_46181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}