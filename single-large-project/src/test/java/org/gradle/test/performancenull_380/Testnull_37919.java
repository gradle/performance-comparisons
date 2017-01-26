package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37919 {
    private final Productionnull_37919 production = new Productionnull_37919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}