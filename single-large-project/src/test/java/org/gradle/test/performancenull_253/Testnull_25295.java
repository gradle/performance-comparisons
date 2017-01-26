package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25295 {
    private final Productionnull_25295 production = new Productionnull_25295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}