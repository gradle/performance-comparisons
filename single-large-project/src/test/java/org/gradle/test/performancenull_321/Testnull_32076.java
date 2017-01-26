package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32076 {
    private final Productionnull_32076 production = new Productionnull_32076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}