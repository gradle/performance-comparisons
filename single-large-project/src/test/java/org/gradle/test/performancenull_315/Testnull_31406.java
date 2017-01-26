package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31406 {
    private final Productionnull_31406 production = new Productionnull_31406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}