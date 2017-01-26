package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34949 {
    private final Productionnull_34949 production = new Productionnull_34949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}