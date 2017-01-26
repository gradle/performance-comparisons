package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42067 {
    private final Productionnull_42067 production = new Productionnull_42067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}