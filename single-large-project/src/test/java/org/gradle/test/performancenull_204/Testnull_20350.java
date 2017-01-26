package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20350 {
    private final Productionnull_20350 production = new Productionnull_20350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}