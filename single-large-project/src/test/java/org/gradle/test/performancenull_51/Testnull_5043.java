package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5043 {
    private final Productionnull_5043 production = new Productionnull_5043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}