package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2203 {
    private final Productionnull_2203 production = new Productionnull_2203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}