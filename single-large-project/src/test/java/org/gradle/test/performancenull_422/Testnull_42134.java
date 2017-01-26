package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42134 {
    private final Productionnull_42134 production = new Productionnull_42134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}