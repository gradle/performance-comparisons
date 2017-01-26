package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49145 {
    private final Productionnull_49145 production = new Productionnull_49145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}