package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42068 {
    private final Productionnull_42068 production = new Productionnull_42068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}