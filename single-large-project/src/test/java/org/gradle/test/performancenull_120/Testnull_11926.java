package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11926 {
    private final Productionnull_11926 production = new Productionnull_11926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}