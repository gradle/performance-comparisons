package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42072 {
    private final Productionnull_42072 production = new Productionnull_42072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}