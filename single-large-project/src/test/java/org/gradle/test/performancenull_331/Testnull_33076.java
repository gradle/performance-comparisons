package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33076 {
    private final Productionnull_33076 production = new Productionnull_33076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}