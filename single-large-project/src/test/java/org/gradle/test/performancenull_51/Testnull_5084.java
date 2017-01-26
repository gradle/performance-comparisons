package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5084 {
    private final Productionnull_5084 production = new Productionnull_5084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}