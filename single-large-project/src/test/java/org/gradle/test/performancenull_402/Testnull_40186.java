package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40186 {
    private final Productionnull_40186 production = new Productionnull_40186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}