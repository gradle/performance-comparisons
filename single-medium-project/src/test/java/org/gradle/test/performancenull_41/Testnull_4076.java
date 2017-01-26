package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4076 {
    private final Productionnull_4076 production = new Productionnull_4076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}