package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30025 {
    private final Productionnull_30025 production = new Productionnull_30025("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}