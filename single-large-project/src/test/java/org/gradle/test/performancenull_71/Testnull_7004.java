package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7004 {
    private final Productionnull_7004 production = new Productionnull_7004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}