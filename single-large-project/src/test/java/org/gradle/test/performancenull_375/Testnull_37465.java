package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37465 {
    private final Productionnull_37465 production = new Productionnull_37465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}