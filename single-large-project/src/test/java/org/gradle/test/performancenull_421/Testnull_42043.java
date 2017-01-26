package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42043 {
    private final Productionnull_42043 production = new Productionnull_42043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}