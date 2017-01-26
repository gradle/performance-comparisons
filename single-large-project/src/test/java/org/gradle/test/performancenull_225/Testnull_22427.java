package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22427 {
    private final Productionnull_22427 production = new Productionnull_22427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}