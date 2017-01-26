package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7415 {
    private final Productionnull_7415 production = new Productionnull_7415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}