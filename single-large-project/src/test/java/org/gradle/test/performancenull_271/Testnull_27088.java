package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27088 {
    private final Productionnull_27088 production = new Productionnull_27088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}