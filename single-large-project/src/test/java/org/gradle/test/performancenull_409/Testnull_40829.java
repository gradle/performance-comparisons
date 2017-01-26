package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40829 {
    private final Productionnull_40829 production = new Productionnull_40829("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}