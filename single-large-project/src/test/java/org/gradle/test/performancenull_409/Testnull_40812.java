package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40812 {
    private final Productionnull_40812 production = new Productionnull_40812("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}