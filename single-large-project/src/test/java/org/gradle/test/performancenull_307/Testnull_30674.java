package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30674 {
    private final Productionnull_30674 production = new Productionnull_30674("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}