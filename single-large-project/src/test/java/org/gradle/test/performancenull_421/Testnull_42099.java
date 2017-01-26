package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42099 {
    private final Productionnull_42099 production = new Productionnull_42099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}