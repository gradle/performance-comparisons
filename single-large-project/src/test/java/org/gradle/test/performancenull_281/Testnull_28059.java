package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28059 {
    private final Productionnull_28059 production = new Productionnull_28059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}