package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5060 {
    private final Productionnull_5060 production = new Productionnull_5060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}