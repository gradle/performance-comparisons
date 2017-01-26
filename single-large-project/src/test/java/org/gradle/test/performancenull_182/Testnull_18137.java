package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18137 {
    private final Productionnull_18137 production = new Productionnull_18137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}