package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7496 {
    private final Productionnull_7496 production = new Productionnull_7496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}