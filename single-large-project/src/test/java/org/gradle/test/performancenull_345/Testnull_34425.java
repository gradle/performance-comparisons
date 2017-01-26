package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34425 {
    private final Productionnull_34425 production = new Productionnull_34425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}