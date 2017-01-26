package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3989 {
    private final Productionnull_3989 production = new Productionnull_3989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}