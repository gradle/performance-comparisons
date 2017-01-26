package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18492 {
    private final Productionnull_18492 production = new Productionnull_18492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}