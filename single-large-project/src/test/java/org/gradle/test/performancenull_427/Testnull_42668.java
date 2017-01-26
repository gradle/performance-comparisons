package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42668 {
    private final Productionnull_42668 production = new Productionnull_42668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}