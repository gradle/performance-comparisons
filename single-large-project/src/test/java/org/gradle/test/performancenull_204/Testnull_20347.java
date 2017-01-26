package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20347 {
    private final Productionnull_20347 production = new Productionnull_20347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}