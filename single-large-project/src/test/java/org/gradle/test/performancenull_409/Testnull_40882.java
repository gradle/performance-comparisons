package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40882 {
    private final Productionnull_40882 production = new Productionnull_40882("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}