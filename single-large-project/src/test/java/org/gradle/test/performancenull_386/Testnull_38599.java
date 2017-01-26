package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38599 {
    private final Productionnull_38599 production = new Productionnull_38599("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}