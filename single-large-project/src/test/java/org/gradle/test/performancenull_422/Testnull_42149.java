package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42149 {
    private final Productionnull_42149 production = new Productionnull_42149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}