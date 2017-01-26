package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6435 {
    private final Productionnull_6435 production = new Productionnull_6435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}