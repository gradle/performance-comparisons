package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25878 {
    private final Productionnull_25878 production = new Productionnull_25878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}