package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40891 {
    private final Productionnull_40891 production = new Productionnull_40891("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}