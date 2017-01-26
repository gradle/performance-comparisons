package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40839 {
    private final Productionnull_40839 production = new Productionnull_40839("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}