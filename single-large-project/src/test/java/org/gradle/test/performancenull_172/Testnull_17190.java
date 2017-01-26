package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17190 {
    private final Productionnull_17190 production = new Productionnull_17190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}