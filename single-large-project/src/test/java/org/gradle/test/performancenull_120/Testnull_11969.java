package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11969 {
    private final Productionnull_11969 production = new Productionnull_11969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}