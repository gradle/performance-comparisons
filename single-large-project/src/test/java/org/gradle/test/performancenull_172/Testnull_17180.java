package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17180 {
    private final Productionnull_17180 production = new Productionnull_17180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}