package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42300 {
    private final Productionnull_42300 production = new Productionnull_42300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}