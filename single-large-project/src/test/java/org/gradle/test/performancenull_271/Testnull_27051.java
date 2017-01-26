package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27051 {
    private final Productionnull_27051 production = new Productionnull_27051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}