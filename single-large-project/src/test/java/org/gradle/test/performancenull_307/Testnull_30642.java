package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30642 {
    private final Productionnull_30642 production = new Productionnull_30642("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}