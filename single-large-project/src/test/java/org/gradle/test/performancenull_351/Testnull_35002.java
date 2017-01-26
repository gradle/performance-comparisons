package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35002 {
    private final Productionnull_35002 production = new Productionnull_35002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}