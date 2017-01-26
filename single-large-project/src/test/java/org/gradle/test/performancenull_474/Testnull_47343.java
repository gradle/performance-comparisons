package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47343 {
    private final Productionnull_47343 production = new Productionnull_47343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}