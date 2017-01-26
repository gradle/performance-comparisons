package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40285 {
    private final Productionnull_40285 production = new Productionnull_40285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}