package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40032 {
    private final Productionnull_40032 production = new Productionnull_40032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}