package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27072 {
    private final Productionnull_27072 production = new Productionnull_27072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}