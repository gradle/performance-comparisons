package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31084 {
    private final Productionnull_31084 production = new Productionnull_31084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}