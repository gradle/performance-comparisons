package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31428 {
    private final Productionnull_31428 production = new Productionnull_31428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}