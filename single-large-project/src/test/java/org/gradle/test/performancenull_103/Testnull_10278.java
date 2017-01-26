package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10278 {
    private final Productionnull_10278 production = new Productionnull_10278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}