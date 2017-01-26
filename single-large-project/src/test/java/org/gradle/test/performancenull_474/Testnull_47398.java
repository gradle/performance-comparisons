package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47398 {
    private final Productionnull_47398 production = new Productionnull_47398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}