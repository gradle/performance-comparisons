package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23579 {
    private final Productionnull_23579 production = new Productionnull_23579("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}