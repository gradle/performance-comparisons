package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35006 {
    private final Productionnull_35006 production = new Productionnull_35006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}