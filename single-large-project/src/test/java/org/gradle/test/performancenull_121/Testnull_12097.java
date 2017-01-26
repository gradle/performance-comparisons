package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12097 {
    private final Productionnull_12097 production = new Productionnull_12097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}