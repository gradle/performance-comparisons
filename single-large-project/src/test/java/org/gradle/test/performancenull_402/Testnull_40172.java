package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40172 {
    private final Productionnull_40172 production = new Productionnull_40172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}