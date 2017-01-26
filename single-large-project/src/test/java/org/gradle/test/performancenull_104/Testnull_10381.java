package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10381 {
    private final Productionnull_10381 production = new Productionnull_10381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}