package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42158 {
    private final Productionnull_42158 production = new Productionnull_42158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}