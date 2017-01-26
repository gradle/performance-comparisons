package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36779 {
    private final Productionnull_36779 production = new Productionnull_36779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}