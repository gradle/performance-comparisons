package org.gradle.test.performancenull_105;

import static org.junit.Assert.*;

public class Testnull_10443 {
    private final Productionnull_10443 production = new Productionnull_10443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}