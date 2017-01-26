package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25891 {
    private final Productionnull_25891 production = new Productionnull_25891("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}