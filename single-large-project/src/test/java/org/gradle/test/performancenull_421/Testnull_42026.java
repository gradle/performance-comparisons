package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42026 {
    private final Productionnull_42026 production = new Productionnull_42026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}