package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42368 {
    private final Productionnull_42368 production = new Productionnull_42368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}