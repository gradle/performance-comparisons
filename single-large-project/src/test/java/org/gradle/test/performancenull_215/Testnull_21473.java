package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21473 {
    private final Productionnull_21473 production = new Productionnull_21473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}