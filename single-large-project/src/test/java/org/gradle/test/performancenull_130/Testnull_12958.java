package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12958 {
    private final Productionnull_12958 production = new Productionnull_12958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}