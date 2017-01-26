package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42689 {
    private final Productionnull_42689 production = new Productionnull_42689("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}