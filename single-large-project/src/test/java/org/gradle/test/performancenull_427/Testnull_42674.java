package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42674 {
    private final Productionnull_42674 production = new Productionnull_42674("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}