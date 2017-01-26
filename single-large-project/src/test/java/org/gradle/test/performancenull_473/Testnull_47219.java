package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47219 {
    private final Productionnull_47219 production = new Productionnull_47219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}