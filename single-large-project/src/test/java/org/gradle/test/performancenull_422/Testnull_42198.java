package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42198 {
    private final Productionnull_42198 production = new Productionnull_42198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}