package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17039 {
    private final Productionnull_17039 production = new Productionnull_17039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}