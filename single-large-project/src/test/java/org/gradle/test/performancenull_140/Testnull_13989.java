package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13989 {
    private final Productionnull_13989 production = new Productionnull_13989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}