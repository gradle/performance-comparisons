package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4181 {
    private final Productionnull_4181 production = new Productionnull_4181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}