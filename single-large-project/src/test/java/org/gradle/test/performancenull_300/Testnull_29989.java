package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29989 {
    private final Productionnull_29989 production = new Productionnull_29989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}