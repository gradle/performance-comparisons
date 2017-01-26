package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2242 {
    private final Productionnull_2242 production = new Productionnull_2242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}