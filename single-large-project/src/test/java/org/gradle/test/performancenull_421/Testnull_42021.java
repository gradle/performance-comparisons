package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42021 {
    private final Productionnull_42021 production = new Productionnull_42021("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}