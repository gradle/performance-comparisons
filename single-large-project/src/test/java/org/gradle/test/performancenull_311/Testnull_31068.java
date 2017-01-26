package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31068 {
    private final Productionnull_31068 production = new Productionnull_31068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}