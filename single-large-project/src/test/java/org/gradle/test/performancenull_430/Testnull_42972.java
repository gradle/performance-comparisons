package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42972 {
    private final Productionnull_42972 production = new Productionnull_42972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}