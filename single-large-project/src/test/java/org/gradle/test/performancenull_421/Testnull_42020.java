package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42020 {
    private final Productionnull_42020 production = new Productionnull_42020("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}