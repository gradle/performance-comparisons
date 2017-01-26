package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40871 {
    private final Productionnull_40871 production = new Productionnull_40871("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}