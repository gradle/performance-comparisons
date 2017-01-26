package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14950 {
    private final Productionnull_14950 production = new Productionnull_14950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}