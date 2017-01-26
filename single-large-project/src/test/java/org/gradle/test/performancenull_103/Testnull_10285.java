package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10285 {
    private final Productionnull_10285 production = new Productionnull_10285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}