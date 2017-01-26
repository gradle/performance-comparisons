package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41429 {
    private final Productionnull_41429 production = new Productionnull_41429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}