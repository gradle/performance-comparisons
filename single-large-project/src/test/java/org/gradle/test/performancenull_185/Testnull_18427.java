package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18427 {
    private final Productionnull_18427 production = new Productionnull_18427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}