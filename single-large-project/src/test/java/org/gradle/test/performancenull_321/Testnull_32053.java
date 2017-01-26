package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32053 {
    private final Productionnull_32053 production = new Productionnull_32053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}