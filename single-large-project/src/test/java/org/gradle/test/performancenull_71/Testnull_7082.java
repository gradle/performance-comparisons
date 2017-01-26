package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7082 {
    private final Productionnull_7082 production = new Productionnull_7082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}