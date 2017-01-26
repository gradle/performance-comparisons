package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4134 {
    private final Productionnull_4134 production = new Productionnull_4134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}