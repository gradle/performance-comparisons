package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42989 {
    private final Productionnull_42989 production = new Productionnull_42989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}