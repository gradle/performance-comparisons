package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32103 {
    private final Productionnull_32103 production = new Productionnull_32103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}