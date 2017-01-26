package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34989 {
    private final Productionnull_34989 production = new Productionnull_34989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}