package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20368 {
    private final Productionnull_20368 production = new Productionnull_20368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}