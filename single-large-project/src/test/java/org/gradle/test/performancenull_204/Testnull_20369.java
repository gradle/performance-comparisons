package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20369 {
    private final Productionnull_20369 production = new Productionnull_20369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}