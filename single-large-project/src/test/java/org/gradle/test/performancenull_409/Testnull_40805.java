package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40805 {
    private final Productionnull_40805 production = new Productionnull_40805("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}