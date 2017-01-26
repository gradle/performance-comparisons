package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21518 {
    private final Productionnull_21518 production = new Productionnull_21518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}