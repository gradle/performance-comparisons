package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35576 {
    private final Productionnull_35576 production = new Productionnull_35576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}