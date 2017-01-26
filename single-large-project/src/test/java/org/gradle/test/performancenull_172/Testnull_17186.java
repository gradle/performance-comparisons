package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17186 {
    private final Productionnull_17186 production = new Productionnull_17186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}