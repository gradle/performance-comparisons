package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12645 {
    private final Productionnull_12645 production = new Productionnull_12645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}