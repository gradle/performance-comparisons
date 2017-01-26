package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32763 {
    private final Productionnull_32763 production = new Productionnull_32763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}