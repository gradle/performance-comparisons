package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42673 {
    private final Productionnull_42673 production = new Productionnull_42673("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}