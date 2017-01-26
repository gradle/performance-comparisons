package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41876 {
    private final Productionnull_41876 production = new Productionnull_41876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}