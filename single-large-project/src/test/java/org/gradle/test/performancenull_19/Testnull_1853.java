package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1853 {
    private final Productionnull_1853 production = new Productionnull_1853("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}