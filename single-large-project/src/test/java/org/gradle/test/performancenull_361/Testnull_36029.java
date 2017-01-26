package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36029 {
    private final Productionnull_36029 production = new Productionnull_36029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}