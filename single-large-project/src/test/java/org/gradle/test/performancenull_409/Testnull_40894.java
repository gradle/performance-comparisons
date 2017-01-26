package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40894 {
    private final Productionnull_40894 production = new Productionnull_40894("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}