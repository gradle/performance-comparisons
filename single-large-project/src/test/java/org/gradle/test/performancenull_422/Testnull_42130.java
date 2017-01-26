package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42130 {
    private final Productionnull_42130 production = new Productionnull_42130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}