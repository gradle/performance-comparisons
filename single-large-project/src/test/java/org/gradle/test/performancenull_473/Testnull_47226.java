package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47226 {
    private final Productionnull_47226 production = new Productionnull_47226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}