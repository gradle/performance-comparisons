package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37247 {
    private final Productionnull_37247 production = new Productionnull_37247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}