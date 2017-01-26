package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42006 {
    private final Productionnull_42006 production = new Productionnull_42006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}