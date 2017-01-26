package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40817 {
    private final Productionnull_40817 production = new Productionnull_40817("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}