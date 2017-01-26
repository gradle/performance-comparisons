package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42170 {
    private final Productionnull_42170 production = new Productionnull_42170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}