package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1672 {
    private final Productionnull_1672 production = new Productionnull_1672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}