package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36258 {
    private final Productionnull_36258 production = new Productionnull_36258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}