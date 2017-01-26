package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42048 {
    private final Productionnull_42048 production = new Productionnull_42048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}