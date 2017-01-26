package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30623 {
    private final Productionnull_30623 production = new Productionnull_30623("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}