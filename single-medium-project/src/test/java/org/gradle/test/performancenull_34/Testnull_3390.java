package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3390 {
    private final Productionnull_3390 production = new Productionnull_3390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}