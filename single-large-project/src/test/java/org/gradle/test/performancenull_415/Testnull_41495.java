package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41495 {
    private final Productionnull_41495 production = new Productionnull_41495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}