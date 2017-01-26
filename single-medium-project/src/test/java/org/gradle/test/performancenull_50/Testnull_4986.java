package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4986 {
    private final Productionnull_4986 production = new Productionnull_4986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}