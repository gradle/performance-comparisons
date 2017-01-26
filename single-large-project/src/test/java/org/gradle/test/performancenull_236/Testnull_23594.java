package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23594 {
    private final Productionnull_23594 production = new Productionnull_23594("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}