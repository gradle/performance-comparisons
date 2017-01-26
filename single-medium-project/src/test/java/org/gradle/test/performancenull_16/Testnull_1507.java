package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1507 {
    private final Productionnull_1507 production = new Productionnull_1507("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}