package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41406 {
    private final Productionnull_41406 production = new Productionnull_41406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}