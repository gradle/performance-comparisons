package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12065 {
    private final Productionnull_12065 production = new Productionnull_12065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}