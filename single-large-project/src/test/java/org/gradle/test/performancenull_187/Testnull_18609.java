package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18609 {
    private final Productionnull_18609 production = new Productionnull_18609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}